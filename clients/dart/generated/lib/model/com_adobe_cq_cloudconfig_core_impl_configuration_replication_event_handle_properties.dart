//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {
  /// Returns a new [ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties] instance.
  ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties({
    this.flushPeriodAgents,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? flushPeriodAgents;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties &&
    other.flushPeriodAgents == flushPeriodAgents;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flushPeriodAgents == null ? 0 : flushPeriodAgents!.hashCode);

  @override
  String toString() => 'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties[flushPeriodAgents=$flushPeriodAgents]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.flushPeriodAgents != null) {
      json[r'flush.agents'] = this.flushPeriodAgents;
    } else {
      json[r'flush.agents'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(
        flushPeriodAgents: ConfigNodePropertyArray.fromJson(json[r'flush.agents']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

