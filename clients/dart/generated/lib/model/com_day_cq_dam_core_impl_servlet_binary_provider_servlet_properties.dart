//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletBinaryProviderServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletBinaryProviderServletProperties] instance.
  ComDayCqDamCoreImplServletBinaryProviderServletProperties({
    this.slingPeriodServletPeriodResourceTypes,
    this.slingPeriodServletPeriodMethods,
    this.cqPeriodDamPeriodDrmPeriodEnable,
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
  ConfigNodePropertyArray? slingPeriodServletPeriodMethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodDrmPeriodEnable;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletBinaryProviderServletProperties &&
    other.slingPeriodServletPeriodResourceTypes == slingPeriodServletPeriodResourceTypes &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods &&
    other.cqPeriodDamPeriodDrmPeriodEnable == cqPeriodDamPeriodDrmPeriodEnable;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodResourceTypes == null ? 0 : slingPeriodServletPeriodResourceTypes!.hashCode) +
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode) +
    (cqPeriodDamPeriodDrmPeriodEnable == null ? 0 : cqPeriodDamPeriodDrmPeriodEnable!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletBinaryProviderServletProperties[slingPeriodServletPeriodResourceTypes=$slingPeriodServletPeriodResourceTypes, slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods, cqPeriodDamPeriodDrmPeriodEnable=$cqPeriodDamPeriodDrmPeriodEnable]';

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
    if (this.cqPeriodDamPeriodDrmPeriodEnable != null) {
      json[r'cq.dam.drm.enable'] = this.cqPeriodDamPeriodDrmPeriodEnable;
    } else {
      json[r'cq.dam.drm.enable'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletBinaryProviderServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletBinaryProviderServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletBinaryProviderServletProperties(
        slingPeriodServletPeriodResourceTypes: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.resourceTypes']),
        slingPeriodServletPeriodMethods: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.methods']),
        cqPeriodDamPeriodDrmPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.drm.enable']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletBinaryProviderServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletBinaryProviderServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletBinaryProviderServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletBinaryProviderServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletBinaryProviderServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletBinaryProviderServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletBinaryProviderServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletBinaryProviderServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletBinaryProviderServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletBinaryProviderServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

