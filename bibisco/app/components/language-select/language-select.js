/*
 * Copyright (C) 2014-2017 Andrea Feccomandi
 *
 * Licensed under the terms of GNU GPL License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/gpl-2.0.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY.
 * See the GNU General Public License for more details.
 *
 */
angular.
module('bibiscoApp').
component('languageselect', {
  templateUrl: 'components/language-select/language-select.html',
  controller: LanguageSelectController,
  bindings: {
    onchangelanguage: '&'
  }
});


function LanguageSelectController(LocaleService, LoggerService) {
  LoggerService.debug('Start LanguageSelectController...');
  this.currentLocale = LocaleService.getCurrentLocale();
  this.locales = LocaleService.getLocales();
  this.changeLanguage = function() {
    LocaleService.setCurrentLocale(this.currentLocale);
    this.onchangelanguage({
      language: this.currentLocale
    });
  };
  LoggerService.debug('End LanguageSelectController...');
}