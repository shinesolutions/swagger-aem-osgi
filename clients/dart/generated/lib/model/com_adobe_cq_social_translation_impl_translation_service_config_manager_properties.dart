//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
  /// Returns a new [ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] instance.
  ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties({
    this.translatePeriodLanguage,
    this.translatePeriodDisplay,
    this.translatePeriodAttribution,
    this.translatePeriodCaching,
    this.translatePeriodSmartPeriodRendering,
    this.translatePeriodCachingPeriodDuration,
    this.translatePeriodSessionPeriodSavePeriodInterval,
    this.translatePeriodSessionPeriodSavePeriodBatchLimit,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? translatePeriodLanguage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? translatePeriodDisplay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? translatePeriodAttribution;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? translatePeriodCaching;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? translatePeriodSmartPeriodRendering;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? translatePeriodCachingPeriodDuration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? translatePeriodSessionPeriodSavePeriodInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? translatePeriodSessionPeriodSavePeriodBatchLimit;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties &&
    other.translatePeriodLanguage == translatePeriodLanguage &&
    other.translatePeriodDisplay == translatePeriodDisplay &&
    other.translatePeriodAttribution == translatePeriodAttribution &&
    other.translatePeriodCaching == translatePeriodCaching &&
    other.translatePeriodSmartPeriodRendering == translatePeriodSmartPeriodRendering &&
    other.translatePeriodCachingPeriodDuration == translatePeriodCachingPeriodDuration &&
    other.translatePeriodSessionPeriodSavePeriodInterval == translatePeriodSessionPeriodSavePeriodInterval &&
    other.translatePeriodSessionPeriodSavePeriodBatchLimit == translatePeriodSessionPeriodSavePeriodBatchLimit;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (translatePeriodLanguage == null ? 0 : translatePeriodLanguage!.hashCode) +
    (translatePeriodDisplay == null ? 0 : translatePeriodDisplay!.hashCode) +
    (translatePeriodAttribution == null ? 0 : translatePeriodAttribution!.hashCode) +
    (translatePeriodCaching == null ? 0 : translatePeriodCaching!.hashCode) +
    (translatePeriodSmartPeriodRendering == null ? 0 : translatePeriodSmartPeriodRendering!.hashCode) +
    (translatePeriodCachingPeriodDuration == null ? 0 : translatePeriodCachingPeriodDuration!.hashCode) +
    (translatePeriodSessionPeriodSavePeriodInterval == null ? 0 : translatePeriodSessionPeriodSavePeriodInterval!.hashCode) +
    (translatePeriodSessionPeriodSavePeriodBatchLimit == null ? 0 : translatePeriodSessionPeriodSavePeriodBatchLimit!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties[translatePeriodLanguage=$translatePeriodLanguage, translatePeriodDisplay=$translatePeriodDisplay, translatePeriodAttribution=$translatePeriodAttribution, translatePeriodCaching=$translatePeriodCaching, translatePeriodSmartPeriodRendering=$translatePeriodSmartPeriodRendering, translatePeriodCachingPeriodDuration=$translatePeriodCachingPeriodDuration, translatePeriodSessionPeriodSavePeriodInterval=$translatePeriodSessionPeriodSavePeriodInterval, translatePeriodSessionPeriodSavePeriodBatchLimit=$translatePeriodSessionPeriodSavePeriodBatchLimit]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.translatePeriodLanguage != null) {
      json[r'translate.language'] = this.translatePeriodLanguage;
    } else {
      json[r'translate.language'] = null;
    }
    if (this.translatePeriodDisplay != null) {
      json[r'translate.display'] = this.translatePeriodDisplay;
    } else {
      json[r'translate.display'] = null;
    }
    if (this.translatePeriodAttribution != null) {
      json[r'translate.attribution'] = this.translatePeriodAttribution;
    } else {
      json[r'translate.attribution'] = null;
    }
    if (this.translatePeriodCaching != null) {
      json[r'translate.caching'] = this.translatePeriodCaching;
    } else {
      json[r'translate.caching'] = null;
    }
    if (this.translatePeriodSmartPeriodRendering != null) {
      json[r'translate.smart.rendering'] = this.translatePeriodSmartPeriodRendering;
    } else {
      json[r'translate.smart.rendering'] = null;
    }
    if (this.translatePeriodCachingPeriodDuration != null) {
      json[r'translate.caching.duration'] = this.translatePeriodCachingPeriodDuration;
    } else {
      json[r'translate.caching.duration'] = null;
    }
    if (this.translatePeriodSessionPeriodSavePeriodInterval != null) {
      json[r'translate.session.save.interval'] = this.translatePeriodSessionPeriodSavePeriodInterval;
    } else {
      json[r'translate.session.save.interval'] = null;
    }
    if (this.translatePeriodSessionPeriodSavePeriodBatchLimit != null) {
      json[r'translate.session.save.batchLimit'] = this.translatePeriodSessionPeriodSavePeriodBatchLimit;
    } else {
      json[r'translate.session.save.batchLimit'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
        translatePeriodLanguage: ConfigNodePropertyDropDown.fromJson(json[r'translate.language']),
        translatePeriodDisplay: ConfigNodePropertyDropDown.fromJson(json[r'translate.display']),
        translatePeriodAttribution: ConfigNodePropertyBoolean.fromJson(json[r'translate.attribution']),
        translatePeriodCaching: ConfigNodePropertyDropDown.fromJson(json[r'translate.caching']),
        translatePeriodSmartPeriodRendering: ConfigNodePropertyDropDown.fromJson(json[r'translate.smart.rendering']),
        translatePeriodCachingPeriodDuration: ConfigNodePropertyString.fromJson(json[r'translate.caching.duration']),
        translatePeriodSessionPeriodSavePeriodInterval: ConfigNodePropertyString.fromJson(json[r'translate.session.save.interval']),
        translatePeriodSessionPeriodSavePeriodBatchLimit: ConfigNodePropertyString.fromJson(json[r'translate.session.save.batchLimit']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

