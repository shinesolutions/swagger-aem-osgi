//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingXssImplXSSFilterImplProperties {
  /// Returns a new [OrgApacheSlingXssImplXSSFilterImplProperties] instance.
  OrgApacheSlingXssImplXSSFilterImplProperties({
    this.policyPath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? policyPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingXssImplXSSFilterImplProperties &&
    other.policyPath == policyPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (policyPath == null ? 0 : policyPath!.hashCode);

  @override
  String toString() => 'OrgApacheSlingXssImplXSSFilterImplProperties[policyPath=$policyPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.policyPath != null) {
      json[r'policyPath'] = this.policyPath;
    } else {
      json[r'policyPath'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingXssImplXSSFilterImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingXssImplXSSFilterImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingXssImplXSSFilterImplProperties(
        policyPath: ConfigNodePropertyString.fromJson(json[r'policyPath']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingXssImplXSSFilterImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingXssImplXSSFilterImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingXssImplXSSFilterImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingXssImplXSSFilterImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingXssImplXSSFilterImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingXssImplXSSFilterImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingXssImplXSSFilterImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingXssImplXSSFilterImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingXssImplXSSFilterImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingXssImplXSSFilterImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

