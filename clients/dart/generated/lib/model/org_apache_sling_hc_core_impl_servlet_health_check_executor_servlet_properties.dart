//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {
  /// Returns a new [OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties] instance.
  OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties({
    this.servletPath,
    this.disabled,
    this.corsPeriodAccessControlAllowOrigin,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? servletPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? disabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? corsPeriodAccessControlAllowOrigin;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties &&
    other.servletPath == servletPath &&
    other.disabled == disabled &&
    other.corsPeriodAccessControlAllowOrigin == corsPeriodAccessControlAllowOrigin;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servletPath == null ? 0 : servletPath!.hashCode) +
    (disabled == null ? 0 : disabled!.hashCode) +
    (corsPeriodAccessControlAllowOrigin == null ? 0 : corsPeriodAccessControlAllowOrigin!.hashCode);

  @override
  String toString() => 'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties[servletPath=$servletPath, disabled=$disabled, corsPeriodAccessControlAllowOrigin=$corsPeriodAccessControlAllowOrigin]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servletPath != null) {
      json[r'servletPath'] = this.servletPath;
    } else {
      json[r'servletPath'] = null;
    }
    if (this.disabled != null) {
      json[r'disabled'] = this.disabled;
    } else {
      json[r'disabled'] = null;
    }
    if (this.corsPeriodAccessControlAllowOrigin != null) {
      json[r'cors.accessControlAllowOrigin'] = this.corsPeriodAccessControlAllowOrigin;
    } else {
      json[r'cors.accessControlAllowOrigin'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(
        servletPath: ConfigNodePropertyString.fromJson(json[r'servletPath']),
        disabled: ConfigNodePropertyBoolean.fromJson(json[r'disabled']),
        corsPeriodAccessControlAllowOrigin: ConfigNodePropertyString.fromJson(json[r'cors.accessControlAllowOrigin']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

