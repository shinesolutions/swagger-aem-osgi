//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {
  /// Returns a new [OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties] instance.
  OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties({
    this.logPeriodStacktracePeriodOnclose,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? logPeriodStacktracePeriodOnclose;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties &&
    other.logPeriodStacktracePeriodOnclose == logPeriodStacktracePeriodOnclose;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (logPeriodStacktracePeriodOnclose == null ? 0 : logPeriodStacktracePeriodOnclose!.hashCode);

  @override
  String toString() => 'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties[logPeriodStacktracePeriodOnclose=$logPeriodStacktracePeriodOnclose]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.logPeriodStacktracePeriodOnclose != null) {
      json[r'log.stacktrace.onclose'] = this.logPeriodStacktracePeriodOnclose;
    } else {
      json[r'log.stacktrace.onclose'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(
        logPeriodStacktracePeriodOnclose: ConfigNodePropertyBoolean.fromJson(json[r'log.stacktrace.onclose']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

