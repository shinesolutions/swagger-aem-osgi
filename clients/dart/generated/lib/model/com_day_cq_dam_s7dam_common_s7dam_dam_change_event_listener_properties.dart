//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {
  /// Returns a new [ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties] instance.
  ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties({
    this.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties &&
    other.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled == cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled == null ? 0 : cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties[cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled=$cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled != null) {
      json[r'cq.dam.s7dam.damchangeeventlistener.enabled'] = this.cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled;
    } else {
      json[r'cq.dam.s7dam.damchangeeventlistener.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(
        cqPeriodDamPeriodS7damPeriodDamchangeeventlistenerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.s7dam.damchangeeventlistener.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

