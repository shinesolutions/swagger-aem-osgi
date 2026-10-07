//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties] instance.
  ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties({
    this.legacyCloudUGCPathMapping,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? legacyCloudUGCPathMapping;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties &&
    other.legacyCloudUGCPathMapping == legacyCloudUGCPathMapping;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (legacyCloudUGCPathMapping == null ? 0 : legacyCloudUGCPathMapping!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties[legacyCloudUGCPathMapping=$legacyCloudUGCPathMapping]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.legacyCloudUGCPathMapping != null) {
      json[r'legacyCloudUGCPathMapping'] = this.legacyCloudUGCPathMapping;
    } else {
      json[r'legacyCloudUGCPathMapping'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(
        legacyCloudUGCPathMapping: ConfigNodePropertyBoolean.fromJson(json[r'legacyCloudUGCPathMapping']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

