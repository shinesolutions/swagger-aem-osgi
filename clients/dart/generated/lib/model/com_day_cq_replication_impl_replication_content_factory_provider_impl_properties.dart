//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {
  /// Returns a new [ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties] instance.
  ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties({
    this.replicationPeriodContentPeriodUseFileStorage,
    this.replicationPeriodContentPeriodMaxCommitAttempts,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? replicationPeriodContentPeriodUseFileStorage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? replicationPeriodContentPeriodMaxCommitAttempts;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties &&
    other.replicationPeriodContentPeriodUseFileStorage == replicationPeriodContentPeriodUseFileStorage &&
    other.replicationPeriodContentPeriodMaxCommitAttempts == replicationPeriodContentPeriodMaxCommitAttempts;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (replicationPeriodContentPeriodUseFileStorage == null ? 0 : replicationPeriodContentPeriodUseFileStorage!.hashCode) +
    (replicationPeriodContentPeriodMaxCommitAttempts == null ? 0 : replicationPeriodContentPeriodMaxCommitAttempts!.hashCode);

  @override
  String toString() => 'ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties[replicationPeriodContentPeriodUseFileStorage=$replicationPeriodContentPeriodUseFileStorage, replicationPeriodContentPeriodMaxCommitAttempts=$replicationPeriodContentPeriodMaxCommitAttempts]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.replicationPeriodContentPeriodUseFileStorage != null) {
      json[r'replication.content.useFileStorage'] = this.replicationPeriodContentPeriodUseFileStorage;
    } else {
      json[r'replication.content.useFileStorage'] = null;
    }
    if (this.replicationPeriodContentPeriodMaxCommitAttempts != null) {
      json[r'replication.content.maxCommitAttempts'] = this.replicationPeriodContentPeriodMaxCommitAttempts;
    } else {
      json[r'replication.content.maxCommitAttempts'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(
        replicationPeriodContentPeriodUseFileStorage: ConfigNodePropertyBoolean.fromJson(json[r'replication.content.useFileStorage']),
        replicationPeriodContentPeriodMaxCommitAttempts: ConfigNodePropertyInteger.fromJson(json[r'replication.content.maxCommitAttempts']),
      );
    }
    return null;
  }

  static List<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

