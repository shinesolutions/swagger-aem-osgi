//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingAuthCoreImplLogoutServletProperties {
  /// Returns a new [OrgApacheSlingAuthCoreImplLogoutServletProperties] instance.
  OrgApacheSlingAuthCoreImplLogoutServletProperties({
    this.slingPeriodServletPeriodMethods,
    this.slingPeriodServletPeriodPaths,
  });

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
  ConfigNodePropertyString? slingPeriodServletPeriodPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingAuthCoreImplLogoutServletProperties &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods &&
    other.slingPeriodServletPeriodPaths == slingPeriodServletPeriodPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode) +
    (slingPeriodServletPeriodPaths == null ? 0 : slingPeriodServletPeriodPaths!.hashCode);

  @override
  String toString() => 'OrgApacheSlingAuthCoreImplLogoutServletProperties[slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods, slingPeriodServletPeriodPaths=$slingPeriodServletPeriodPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodServletPeriodMethods != null) {
      json[r'sling.servlet.methods'] = this.slingPeriodServletPeriodMethods;
    } else {
      json[r'sling.servlet.methods'] = null;
    }
    if (this.slingPeriodServletPeriodPaths != null) {
      json[r'sling.servlet.paths'] = this.slingPeriodServletPeriodPaths;
    } else {
      json[r'sling.servlet.paths'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingAuthCoreImplLogoutServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingAuthCoreImplLogoutServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingAuthCoreImplLogoutServletProperties(
        slingPeriodServletPeriodMethods: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.methods']),
        slingPeriodServletPeriodPaths: ConfigNodePropertyString.fromJson(json[r'sling.servlet.paths']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingAuthCoreImplLogoutServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingAuthCoreImplLogoutServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingAuthCoreImplLogoutServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingAuthCoreImplLogoutServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingAuthCoreImplLogoutServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingAuthCoreImplLogoutServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingAuthCoreImplLogoutServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingAuthCoreImplLogoutServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingAuthCoreImplLogoutServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingAuthCoreImplLogoutServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

