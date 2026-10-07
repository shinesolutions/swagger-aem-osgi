//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
  /// Returns a new [ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties] instance.
  ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties({
    this.enable,
    this.ttl1,
    this.ttl2,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? ttl1;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? ttl2;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties &&
    other.enable == enable &&
    other.ttl1 == ttl1 &&
    other.ttl2 == ttl2;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enable == null ? 0 : enable!.hashCode) +
    (ttl1 == null ? 0 : ttl1!.hashCode) +
    (ttl2 == null ? 0 : ttl2!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties[enable=$enable, ttl1=$ttl1, ttl2=$ttl2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enable != null) {
      json[r'enable'] = this.enable;
    } else {
      json[r'enable'] = null;
    }
    if (this.ttl1 != null) {
      json[r'ttl1'] = this.ttl1;
    } else {
      json[r'ttl1'] = null;
    }
    if (this.ttl2 != null) {
      json[r'ttl2'] = this.ttl2;
    } else {
      json[r'ttl2'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
        enable: ConfigNodePropertyBoolean.fromJson(json[r'enable']),
        ttl1: ConfigNodePropertyInteger.fromJson(json[r'ttl1']),
        ttl2: ConfigNodePropertyInteger.fromJson(json[r'ttl2']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

