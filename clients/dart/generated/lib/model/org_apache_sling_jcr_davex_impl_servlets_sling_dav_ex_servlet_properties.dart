//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
  /// Returns a new [OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties] instance.
  OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties({
    this.alias,
    this.davPeriodCreateAbsoluteUri,
    this.davPeriodProtectedhandlers,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? alias;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? davPeriodCreateAbsoluteUri;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? davPeriodProtectedhandlers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties &&
    other.alias == alias &&
    other.davPeriodCreateAbsoluteUri == davPeriodCreateAbsoluteUri &&
    other.davPeriodProtectedhandlers == davPeriodProtectedhandlers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (alias == null ? 0 : alias!.hashCode) +
    (davPeriodCreateAbsoluteUri == null ? 0 : davPeriodCreateAbsoluteUri!.hashCode) +
    (davPeriodProtectedhandlers == null ? 0 : davPeriodProtectedhandlers!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties[alias=$alias, davPeriodCreateAbsoluteUri=$davPeriodCreateAbsoluteUri, davPeriodProtectedhandlers=$davPeriodProtectedhandlers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.alias != null) {
      json[r'alias'] = this.alias;
    } else {
      json[r'alias'] = null;
    }
    if (this.davPeriodCreateAbsoluteUri != null) {
      json[r'dav.create-absolute-uri'] = this.davPeriodCreateAbsoluteUri;
    } else {
      json[r'dav.create-absolute-uri'] = null;
    }
    if (this.davPeriodProtectedhandlers != null) {
      json[r'dav.protectedhandlers'] = this.davPeriodProtectedhandlers;
    } else {
      json[r'dav.protectedhandlers'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(
        alias: ConfigNodePropertyString.fromJson(json[r'alias']),
        davPeriodCreateAbsoluteUri: ConfigNodePropertyBoolean.fromJson(json[r'dav.create-absolute-uri']),
        davPeriodProtectedhandlers: ConfigNodePropertyString.fromJson(json[r'dav.protectedhandlers']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

