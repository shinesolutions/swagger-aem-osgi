//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {
  /// Returns a new [ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties] instance.
  ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties({
    this.dmreplicateonmodifyPeriodEnabled,
    this.dmreplicateonmodifyPeriodForcesyncdeletes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dmreplicateonmodifyPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dmreplicateonmodifyPeriodForcesyncdeletes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties &&
    other.dmreplicateonmodifyPeriodEnabled == dmreplicateonmodifyPeriodEnabled &&
    other.dmreplicateonmodifyPeriodForcesyncdeletes == dmreplicateonmodifyPeriodForcesyncdeletes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dmreplicateonmodifyPeriodEnabled == null ? 0 : dmreplicateonmodifyPeriodEnabled!.hashCode) +
    (dmreplicateonmodifyPeriodForcesyncdeletes == null ? 0 : dmreplicateonmodifyPeriodForcesyncdeletes!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties[dmreplicateonmodifyPeriodEnabled=$dmreplicateonmodifyPeriodEnabled, dmreplicateonmodifyPeriodForcesyncdeletes=$dmreplicateonmodifyPeriodForcesyncdeletes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dmreplicateonmodifyPeriodEnabled != null) {
      json[r'dmreplicateonmodify.enabled'] = this.dmreplicateonmodifyPeriodEnabled;
    } else {
      json[r'dmreplicateonmodify.enabled'] = null;
    }
    if (this.dmreplicateonmodifyPeriodForcesyncdeletes != null) {
      json[r'dmreplicateonmodify.forcesyncdeletes'] = this.dmreplicateonmodifyPeriodForcesyncdeletes;
    } else {
      json[r'dmreplicateonmodify.forcesyncdeletes'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(
        dmreplicateonmodifyPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'dmreplicateonmodify.enabled']),
        dmreplicateonmodifyPeriodForcesyncdeletes: ConfigNodePropertyBoolean.fromJson(json[r'dmreplicateonmodify.forcesyncdeletes']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

