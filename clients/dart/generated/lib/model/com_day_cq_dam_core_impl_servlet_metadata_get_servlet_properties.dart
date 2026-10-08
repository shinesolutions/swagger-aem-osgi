//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletMetadataGetServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletMetadataGetServletProperties] instance.
  ComDayCqDamCoreImplServletMetadataGetServletProperties({
    this.slingPeriodServletPeriodResourceTypes,
    this.slingPeriodServletPeriodMethods,
    this.slingPeriodServletPeriodExtensions,
    this.slingPeriodServletPeriodSelectors,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodResourceTypes;

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
  ConfigNodePropertyString? slingPeriodServletPeriodExtensions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodSelectors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletMetadataGetServletProperties &&
    other.slingPeriodServletPeriodResourceTypes == slingPeriodServletPeriodResourceTypes &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods &&
    other.slingPeriodServletPeriodExtensions == slingPeriodServletPeriodExtensions &&
    other.slingPeriodServletPeriodSelectors == slingPeriodServletPeriodSelectors;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodResourceTypes == null ? 0 : slingPeriodServletPeriodResourceTypes!.hashCode) +
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode) +
    (slingPeriodServletPeriodExtensions == null ? 0 : slingPeriodServletPeriodExtensions!.hashCode) +
    (slingPeriodServletPeriodSelectors == null ? 0 : slingPeriodServletPeriodSelectors!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletMetadataGetServletProperties[slingPeriodServletPeriodResourceTypes=$slingPeriodServletPeriodResourceTypes, slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods, slingPeriodServletPeriodExtensions=$slingPeriodServletPeriodExtensions, slingPeriodServletPeriodSelectors=$slingPeriodServletPeriodSelectors]';

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
    if (this.slingPeriodServletPeriodExtensions != null) {
      json[r'sling.servlet.extensions'] = this.slingPeriodServletPeriodExtensions;
    } else {
      json[r'sling.servlet.extensions'] = null;
    }
    if (this.slingPeriodServletPeriodSelectors != null) {
      json[r'sling.servlet.selectors'] = this.slingPeriodServletPeriodSelectors;
    } else {
      json[r'sling.servlet.selectors'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletMetadataGetServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletMetadataGetServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletMetadataGetServletProperties(
        slingPeriodServletPeriodResourceTypes: ConfigNodePropertyString.fromJson(json[r'sling.servlet.resourceTypes']),
        slingPeriodServletPeriodMethods: ConfigNodePropertyString.fromJson(json[r'sling.servlet.methods']),
        slingPeriodServletPeriodExtensions: ConfigNodePropertyString.fromJson(json[r'sling.servlet.extensions']),
        slingPeriodServletPeriodSelectors: ConfigNodePropertyString.fromJson(json[r'sling.servlet.selectors']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletMetadataGetServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletMetadataGetServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletMetadataGetServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletMetadataGetServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletMetadataGetServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletMetadataGetServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletMetadataGetServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletMetadataGetServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletMetadataGetServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletMetadataGetServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

