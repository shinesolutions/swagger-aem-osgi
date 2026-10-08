//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReplicationImplReplicatorImplProperties {
  /// Returns a new [ComDayCqReplicationImplReplicatorImplProperties] instance.
  ComDayCqReplicationImplReplicatorImplProperties({
    this.distributeEvents,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? distributeEvents;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReplicationImplReplicatorImplProperties &&
    other.distributeEvents == distributeEvents;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (distributeEvents == null ? 0 : distributeEvents!.hashCode);

  @override
  String toString() => 'ComDayCqReplicationImplReplicatorImplProperties[distributeEvents=$distributeEvents]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.distributeEvents != null) {
      json[r'distribute_events'] = this.distributeEvents;
    } else {
      json[r'distribute_events'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReplicationImplReplicatorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReplicationImplReplicatorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReplicationImplReplicatorImplProperties(
        distributeEvents: ConfigNodePropertyBoolean.fromJson(json[r'distribute_events']),
      );
    }
    return null;
  }

  static List<ComDayCqReplicationImplReplicatorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReplicationImplReplicatorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReplicationImplReplicatorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReplicationImplReplicatorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReplicationImplReplicatorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReplicationImplReplicatorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReplicationImplReplicatorImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReplicationImplReplicatorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReplicationImplReplicatorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReplicationImplReplicatorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

