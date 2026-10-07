//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {
  /// Returns a new [ComAdobeCqSocialSyncImplDiffChangesObserverProperties] instance.
  ComAdobeCqSocialSyncImplDiffChangesObserverProperties({
    this.enabled,
    this.agentName,
    this.diffPath,
    this.propertyNames,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? agentName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? diffPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? propertyNames;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialSyncImplDiffChangesObserverProperties &&
    other.enabled == enabled &&
    other.agentName == agentName &&
    other.diffPath == diffPath &&
    other.propertyNames == propertyNames;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabled == null ? 0 : enabled!.hashCode) +
    (agentName == null ? 0 : agentName!.hashCode) +
    (diffPath == null ? 0 : diffPath!.hashCode) +
    (propertyNames == null ? 0 : propertyNames!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialSyncImplDiffChangesObserverProperties[enabled=$enabled, agentName=$agentName, diffPath=$diffPath, propertyNames=$propertyNames]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.agentName != null) {
      json[r'agentName'] = this.agentName;
    } else {
      json[r'agentName'] = null;
    }
    if (this.diffPath != null) {
      json[r'diffPath'] = this.diffPath;
    } else {
      json[r'diffPath'] = null;
    }
    if (this.propertyNames != null) {
      json[r'propertyNames'] = this.propertyNames;
    } else {
      json[r'propertyNames'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialSyncImplDiffChangesObserverProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialSyncImplDiffChangesObserverProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        agentName: ConfigNodePropertyString.fromJson(json[r'agentName']),
        diffPath: ConfigNodePropertyString.fromJson(json[r'diffPath']),
        propertyNames: ConfigNodePropertyString.fromJson(json[r'propertyNames']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialSyncImplDiffChangesObserverProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialSyncImplDiffChangesObserverProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialSyncImplDiffChangesObserverProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialSyncImplDiffChangesObserverProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialSyncImplDiffChangesObserverProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialSyncImplDiffChangesObserverProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialSyncImplDiffChangesObserverProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialSyncImplDiffChangesObserverProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialSyncImplDiffChangesObserverProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialSyncImplDiffChangesObserverProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

