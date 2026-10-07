//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
  /// Returns a new [OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties] instance.
  OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties({
    this.userPeriodMapping,
    this.userPeriodDefault,
    this.userPeriodEnablePeriodDefaultPeriodMapping,
    this.requirePeriodValidation,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? userPeriodMapping;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? userPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? userPeriodEnablePeriodDefaultPeriodMapping;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? requirePeriodValidation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties &&
    other.userPeriodMapping == userPeriodMapping &&
    other.userPeriodDefault == userPeriodDefault &&
    other.userPeriodEnablePeriodDefaultPeriodMapping == userPeriodEnablePeriodDefaultPeriodMapping &&
    other.requirePeriodValidation == requirePeriodValidation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (userPeriodMapping == null ? 0 : userPeriodMapping!.hashCode) +
    (userPeriodDefault == null ? 0 : userPeriodDefault!.hashCode) +
    (userPeriodEnablePeriodDefaultPeriodMapping == null ? 0 : userPeriodEnablePeriodDefaultPeriodMapping!.hashCode) +
    (requirePeriodValidation == null ? 0 : requirePeriodValidation!.hashCode);

  @override
  String toString() => 'OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties[userPeriodMapping=$userPeriodMapping, userPeriodDefault=$userPeriodDefault, userPeriodEnablePeriodDefaultPeriodMapping=$userPeriodEnablePeriodDefaultPeriodMapping, requirePeriodValidation=$requirePeriodValidation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.userPeriodMapping != null) {
      json[r'user.mapping'] = this.userPeriodMapping;
    } else {
      json[r'user.mapping'] = null;
    }
    if (this.userPeriodDefault != null) {
      json[r'user.default'] = this.userPeriodDefault;
    } else {
      json[r'user.default'] = null;
    }
    if (this.userPeriodEnablePeriodDefaultPeriodMapping != null) {
      json[r'user.enable.default.mapping'] = this.userPeriodEnablePeriodDefaultPeriodMapping;
    } else {
      json[r'user.enable.default.mapping'] = null;
    }
    if (this.requirePeriodValidation != null) {
      json[r'require.validation'] = this.requirePeriodValidation;
    } else {
      json[r'require.validation'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(
        userPeriodMapping: ConfigNodePropertyArray.fromJson(json[r'user.mapping']),
        userPeriodDefault: ConfigNodePropertyString.fromJson(json[r'user.default']),
        userPeriodEnablePeriodDefaultPeriodMapping: ConfigNodePropertyBoolean.fromJson(json[r'user.enable.default.mapping']),
        requirePeriodValidation: ConfigNodePropertyBoolean.fromJson(json[r'require.validation']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

