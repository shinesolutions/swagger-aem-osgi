//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties {
  /// Returns a new [OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties] instance.
  OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties({
    this.mergePeriodRoot,
    this.mergePeriodReadOnly,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? mergePeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? mergePeriodReadOnly;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties &&
    other.mergePeriodRoot == mergePeriodRoot &&
    other.mergePeriodReadOnly == mergePeriodReadOnly;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mergePeriodRoot == null ? 0 : mergePeriodRoot!.hashCode) +
    (mergePeriodReadOnly == null ? 0 : mergePeriodReadOnly!.hashCode);

  @override
  String toString() => 'OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties[mergePeriodRoot=$mergePeriodRoot, mergePeriodReadOnly=$mergePeriodReadOnly]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mergePeriodRoot != null) {
      json[r'merge.root'] = this.mergePeriodRoot;
    } else {
      json[r'merge.root'] = null;
    }
    if (this.mergePeriodReadOnly != null) {
      json[r'merge.readOnly'] = this.mergePeriodReadOnly;
    } else {
      json[r'merge.readOnly'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(
        mergePeriodRoot: ConfigNodePropertyString.fromJson(json[r'merge.root']),
        mergePeriodReadOnly: ConfigNodePropertyBoolean.fromJson(json[r'merge.readOnly']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

