//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {
  /// Returns a new [OrgApacheSlingScriptingCoreImplScriptCacheImplProperties] instance.
  OrgApacheSlingScriptingCoreImplScriptCacheImplProperties({
    this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize,
    this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingScriptingCoreImplScriptCacheImplProperties &&
    other.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize == orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize &&
    other.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions == orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize == null ? 0 : orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions == null ? 0 : orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions!.hashCode);

  @override
  String toString() => 'OrgApacheSlingScriptingCoreImplScriptCacheImplProperties[orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize=$orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize, orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions=$orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize != null) {
      json[r'org.apache.sling.scripting.cache.size'] = this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize;
    } else {
      json[r'org.apache.sling.scripting.cache.size'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions != null) {
      json[r'org.apache.sling.scripting.cache.additional_extensions'] = this.orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions;
    } else {
      json[r'org.apache.sling.scripting.cache.additional_extensions'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingScriptingCoreImplScriptCacheImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingScriptingCoreImplScriptCacheImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(
        orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodSize: ConfigNodePropertyInteger.fromJson(json[r'org.apache.sling.scripting.cache.size']),
        orgPeriodApachePeriodSlingPeriodScriptingPeriodCachePeriodAdditionalExtensions: ConfigNodePropertyArray.fromJson(json[r'org.apache.sling.scripting.cache.additional_extensions']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingScriptingCoreImplScriptCacheImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingScriptingCoreImplScriptCacheImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingScriptingCoreImplScriptCacheImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingScriptingCoreImplScriptCacheImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingScriptingCoreImplScriptCacheImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

