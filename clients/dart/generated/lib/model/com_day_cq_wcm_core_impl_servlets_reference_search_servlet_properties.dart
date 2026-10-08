//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
  /// Returns a new [ComDayCqWcmCoreImplServletsReferenceSearchServletProperties] instance.
  ComDayCqWcmCoreImplServletsReferenceSearchServletProperties({
    this.referencesearchservletPeriodMaxReferencesPerPage,
    this.referencesearchservletPeriodMaxPages,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? referencesearchservletPeriodMaxReferencesPerPage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? referencesearchservletPeriodMaxPages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplServletsReferenceSearchServletProperties &&
    other.referencesearchservletPeriodMaxReferencesPerPage == referencesearchservletPeriodMaxReferencesPerPage &&
    other.referencesearchservletPeriodMaxPages == referencesearchservletPeriodMaxPages;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (referencesearchservletPeriodMaxReferencesPerPage == null ? 0 : referencesearchservletPeriodMaxReferencesPerPage!.hashCode) +
    (referencesearchservletPeriodMaxPages == null ? 0 : referencesearchservletPeriodMaxPages!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplServletsReferenceSearchServletProperties[referencesearchservletPeriodMaxReferencesPerPage=$referencesearchservletPeriodMaxReferencesPerPage, referencesearchservletPeriodMaxPages=$referencesearchservletPeriodMaxPages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.referencesearchservletPeriodMaxReferencesPerPage != null) {
      json[r'referencesearchservlet.maxReferencesPerPage'] = this.referencesearchservletPeriodMaxReferencesPerPage;
    } else {
      json[r'referencesearchservlet.maxReferencesPerPage'] = null;
    }
    if (this.referencesearchservletPeriodMaxPages != null) {
      json[r'referencesearchservlet.maxPages'] = this.referencesearchservletPeriodMaxPages;
    } else {
      json[r'referencesearchservlet.maxPages'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplServletsReferenceSearchServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplServletsReferenceSearchServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
        referencesearchservletPeriodMaxReferencesPerPage: ConfigNodePropertyInteger.fromJson(json[r'referencesearchservlet.maxReferencesPerPage']),
        referencesearchservletPeriodMaxPages: ConfigNodePropertyInteger.fromJson(json[r'referencesearchservlet.maxPages']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplServletsReferenceSearchServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplServletsReferenceSearchServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplServletsReferenceSearchServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplServletsReferenceSearchServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

