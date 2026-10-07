//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletResourceCollectionServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletResourceCollectionServletProperties] instance.
  ComDayCqDamCoreImplServletResourceCollectionServletProperties({
    this.slingPeriodServletPeriodResourceTypes,
    this.slingPeriodServletPeriodMethods,
    this.slingPeriodServletPeriodSelectors,
    this.downloadPeriodConfig,
    this.viewPeriodSelector,
    this.sendEmail,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? slingPeriodServletPeriodResourceTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodMethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodSelectors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? downloadPeriodConfig;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? viewPeriodSelector;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? sendEmail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletResourceCollectionServletProperties &&
    other.slingPeriodServletPeriodResourceTypes == slingPeriodServletPeriodResourceTypes &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods &&
    other.slingPeriodServletPeriodSelectors == slingPeriodServletPeriodSelectors &&
    other.downloadPeriodConfig == downloadPeriodConfig &&
    other.viewPeriodSelector == viewPeriodSelector &&
    other.sendEmail == sendEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodResourceTypes == null ? 0 : slingPeriodServletPeriodResourceTypes!.hashCode) +
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode) +
    (slingPeriodServletPeriodSelectors == null ? 0 : slingPeriodServletPeriodSelectors!.hashCode) +
    (downloadPeriodConfig == null ? 0 : downloadPeriodConfig!.hashCode) +
    (viewPeriodSelector == null ? 0 : viewPeriodSelector!.hashCode) +
    (sendEmail == null ? 0 : sendEmail!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletResourceCollectionServletProperties[slingPeriodServletPeriodResourceTypes=$slingPeriodServletPeriodResourceTypes, slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods, slingPeriodServletPeriodSelectors=$slingPeriodServletPeriodSelectors, downloadPeriodConfig=$downloadPeriodConfig, viewPeriodSelector=$viewPeriodSelector, sendEmail=$sendEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodServletPeriodResourceTypes != null) {
      json[r'sling.servlet.resourceTypes'] = this.slingPeriodServletPeriodResourceTypes;
    } else {
      json[r'sling.servlet.resourceTypes'] = null;
    }
    if (this.slingPeriodServletPeriodMethods != null) {
      json[r'sling.servlet.methods'] = this.slingPeriodServletPeriodMethods;
    } else {
      json[r'sling.servlet.methods'] = null;
    }
    if (this.slingPeriodServletPeriodSelectors != null) {
      json[r'sling.servlet.selectors'] = this.slingPeriodServletPeriodSelectors;
    } else {
      json[r'sling.servlet.selectors'] = null;
    }
    if (this.downloadPeriodConfig != null) {
      json[r'download.config'] = this.downloadPeriodConfig;
    } else {
      json[r'download.config'] = null;
    }
    if (this.viewPeriodSelector != null) {
      json[r'view.selector'] = this.viewPeriodSelector;
    } else {
      json[r'view.selector'] = null;
    }
    if (this.sendEmail != null) {
      json[r'send_email'] = this.sendEmail;
    } else {
      json[r'send_email'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletResourceCollectionServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletResourceCollectionServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletResourceCollectionServletProperties(
        slingPeriodServletPeriodResourceTypes: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.resourceTypes']),
        slingPeriodServletPeriodMethods: ConfigNodePropertyString.fromJson(json[r'sling.servlet.methods']),
        slingPeriodServletPeriodSelectors: ConfigNodePropertyString.fromJson(json[r'sling.servlet.selectors']),
        downloadPeriodConfig: ConfigNodePropertyString.fromJson(json[r'download.config']),
        viewPeriodSelector: ConfigNodePropertyString.fromJson(json[r'view.selector']),
        sendEmail: ConfigNodePropertyBoolean.fromJson(json[r'send_email']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletResourceCollectionServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletResourceCollectionServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletResourceCollectionServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletResourceCollectionServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletResourceCollectionServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletResourceCollectionServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletResourceCollectionServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletResourceCollectionServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletResourceCollectionServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletResourceCollectionServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

