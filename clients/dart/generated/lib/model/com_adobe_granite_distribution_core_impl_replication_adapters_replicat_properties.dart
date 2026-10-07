//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {
  /// Returns a new [ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties] instance.
  ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties({
    this.providerName,
    this.forwardPeriodRequests,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? providerName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? forwardPeriodRequests;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties &&
    other.providerName == providerName &&
    other.forwardPeriodRequests == forwardPeriodRequests;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (providerName == null ? 0 : providerName!.hashCode) +
    (forwardPeriodRequests == null ? 0 : forwardPeriodRequests!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties[providerName=$providerName, forwardPeriodRequests=$forwardPeriodRequests]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.providerName != null) {
      json[r'providerName'] = this.providerName;
    } else {
      json[r'providerName'] = null;
    }
    if (this.forwardPeriodRequests != null) {
      json[r'forward.requests'] = this.forwardPeriodRequests;
    } else {
      json[r'forward.requests'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(
        providerName: ConfigNodePropertyString.fromJson(json[r'providerName']),
        forwardPeriodRequests: ConfigNodePropertyBoolean.fromJson(json[r'forward.requests']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

