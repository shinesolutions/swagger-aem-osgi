//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
  /// Returns a new [ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties] instance.
  ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties({
    this.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties &&
    other.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled == cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled == null ? 0 : cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties[cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled=$cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled != null) {
      json[r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled'] = this.cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled;
    } else {
      json[r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(
        cqPeriodDamPeriodS7damPeriodDynamicmediaconfigeventlistenerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

