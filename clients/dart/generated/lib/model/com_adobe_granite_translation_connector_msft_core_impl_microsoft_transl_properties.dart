//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
  /// Returns a new [ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties] instance.
  ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties({
    this.translationFactory,
    this.defaultConnectorLabel,
    this.defaultConnectorAttribution,
    this.defaultConnectorWorkspaceId,
    this.defaultConnectorSubscriptionKey,
    this.languageMapLocation,
    this.categoryMapLocation,
    this.retryAttempts,
    this.timeoutCount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? translationFactory;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultConnectorLabel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultConnectorAttribution;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultConnectorWorkspaceId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultConnectorSubscriptionKey;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? languageMapLocation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? categoryMapLocation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? retryAttempts;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? timeoutCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties &&
    other.translationFactory == translationFactory &&
    other.defaultConnectorLabel == defaultConnectorLabel &&
    other.defaultConnectorAttribution == defaultConnectorAttribution &&
    other.defaultConnectorWorkspaceId == defaultConnectorWorkspaceId &&
    other.defaultConnectorSubscriptionKey == defaultConnectorSubscriptionKey &&
    other.languageMapLocation == languageMapLocation &&
    other.categoryMapLocation == categoryMapLocation &&
    other.retryAttempts == retryAttempts &&
    other.timeoutCount == timeoutCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (translationFactory == null ? 0 : translationFactory!.hashCode) +
    (defaultConnectorLabel == null ? 0 : defaultConnectorLabel!.hashCode) +
    (defaultConnectorAttribution == null ? 0 : defaultConnectorAttribution!.hashCode) +
    (defaultConnectorWorkspaceId == null ? 0 : defaultConnectorWorkspaceId!.hashCode) +
    (defaultConnectorSubscriptionKey == null ? 0 : defaultConnectorSubscriptionKey!.hashCode) +
    (languageMapLocation == null ? 0 : languageMapLocation!.hashCode) +
    (categoryMapLocation == null ? 0 : categoryMapLocation!.hashCode) +
    (retryAttempts == null ? 0 : retryAttempts!.hashCode) +
    (timeoutCount == null ? 0 : timeoutCount!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties[translationFactory=$translationFactory, defaultConnectorLabel=$defaultConnectorLabel, defaultConnectorAttribution=$defaultConnectorAttribution, defaultConnectorWorkspaceId=$defaultConnectorWorkspaceId, defaultConnectorSubscriptionKey=$defaultConnectorSubscriptionKey, languageMapLocation=$languageMapLocation, categoryMapLocation=$categoryMapLocation, retryAttempts=$retryAttempts, timeoutCount=$timeoutCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.translationFactory != null) {
      json[r'translationFactory'] = this.translationFactory;
    } else {
      json[r'translationFactory'] = null;
    }
    if (this.defaultConnectorLabel != null) {
      json[r'defaultConnectorLabel'] = this.defaultConnectorLabel;
    } else {
      json[r'defaultConnectorLabel'] = null;
    }
    if (this.defaultConnectorAttribution != null) {
      json[r'defaultConnectorAttribution'] = this.defaultConnectorAttribution;
    } else {
      json[r'defaultConnectorAttribution'] = null;
    }
    if (this.defaultConnectorWorkspaceId != null) {
      json[r'defaultConnectorWorkspaceId'] = this.defaultConnectorWorkspaceId;
    } else {
      json[r'defaultConnectorWorkspaceId'] = null;
    }
    if (this.defaultConnectorSubscriptionKey != null) {
      json[r'defaultConnectorSubscriptionKey'] = this.defaultConnectorSubscriptionKey;
    } else {
      json[r'defaultConnectorSubscriptionKey'] = null;
    }
    if (this.languageMapLocation != null) {
      json[r'languageMapLocation'] = this.languageMapLocation;
    } else {
      json[r'languageMapLocation'] = null;
    }
    if (this.categoryMapLocation != null) {
      json[r'categoryMapLocation'] = this.categoryMapLocation;
    } else {
      json[r'categoryMapLocation'] = null;
    }
    if (this.retryAttempts != null) {
      json[r'retryAttempts'] = this.retryAttempts;
    } else {
      json[r'retryAttempts'] = null;
    }
    if (this.timeoutCount != null) {
      json[r'timeoutCount'] = this.timeoutCount;
    } else {
      json[r'timeoutCount'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
        translationFactory: ConfigNodePropertyString.fromJson(json[r'translationFactory']),
        defaultConnectorLabel: ConfigNodePropertyString.fromJson(json[r'defaultConnectorLabel']),
        defaultConnectorAttribution: ConfigNodePropertyString.fromJson(json[r'defaultConnectorAttribution']),
        defaultConnectorWorkspaceId: ConfigNodePropertyString.fromJson(json[r'defaultConnectorWorkspaceId']),
        defaultConnectorSubscriptionKey: ConfigNodePropertyString.fromJson(json[r'defaultConnectorSubscriptionKey']),
        languageMapLocation: ConfigNodePropertyString.fromJson(json[r'languageMapLocation']),
        categoryMapLocation: ConfigNodePropertyString.fromJson(json[r'categoryMapLocation']),
        retryAttempts: ConfigNodePropertyInteger.fromJson(json[r'retryAttempts']),
        timeoutCount: ConfigNodePropertyInteger.fromJson(json[r'timeoutCount']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

