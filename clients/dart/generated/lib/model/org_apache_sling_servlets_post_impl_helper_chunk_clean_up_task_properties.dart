//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
  /// Returns a new [OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] instance.
  OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties({
    this.schedulerPeriodExpression,
    this.schedulerPeriodConcurrent,
    this.chunkPeriodCleanupPeriodAge,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? schedulerPeriodExpression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? schedulerPeriodConcurrent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? chunkPeriodCleanupPeriodAge;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.schedulerPeriodConcurrent == schedulerPeriodConcurrent &&
    other.chunkPeriodCleanupPeriodAge == chunkPeriodCleanupPeriodAge;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (schedulerPeriodConcurrent == null ? 0 : schedulerPeriodConcurrent!.hashCode) +
    (chunkPeriodCleanupPeriodAge == null ? 0 : chunkPeriodCleanupPeriodAge!.hashCode);

  @override
  String toString() => 'OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties[schedulerPeriodExpression=$schedulerPeriodExpression, schedulerPeriodConcurrent=$schedulerPeriodConcurrent, chunkPeriodCleanupPeriodAge=$chunkPeriodCleanupPeriodAge]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.schedulerPeriodConcurrent != null) {
      json[r'scheduler.concurrent'] = this.schedulerPeriodConcurrent;
    } else {
      json[r'scheduler.concurrent'] = null;
    }
    if (this.chunkPeriodCleanupPeriodAge != null) {
      json[r'chunk.cleanup.age'] = this.chunkPeriodCleanupPeriodAge;
    } else {
      json[r'chunk.cleanup.age'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        schedulerPeriodConcurrent: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.concurrent']),
        chunkPeriodCleanupPeriodAge: ConfigNodePropertyInteger.fromJson(json[r'chunk.cleanup.age']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

