//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
  /// Returns a new [ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties] instance.
  ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties({
    this.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix,
    this.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix,
    this.defaultPeriodTransportPeriodInputPeriodPackage,
    this.defaultPeriodTransportPeriodOutputPeriodPackage,
    this.defaultPeriodTransportPeriodReplicationPeriodSynchronous,
    this.defaultPeriodTransportPeriodContentpackage,
    this.offloadingPeriodTransporterPeriodDefaultPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultPeriodTransportPeriodAgentToMasterPeriodPrefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultPeriodTransportPeriodInputPeriodPackage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultPeriodTransportPeriodOutputPeriodPackage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? defaultPeriodTransportPeriodReplicationPeriodSynchronous;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? defaultPeriodTransportPeriodContentpackage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? offloadingPeriodTransporterPeriodDefaultPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties &&
    other.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix == defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix &&
    other.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix == defaultPeriodTransportPeriodAgentToMasterPeriodPrefix &&
    other.defaultPeriodTransportPeriodInputPeriodPackage == defaultPeriodTransportPeriodInputPeriodPackage &&
    other.defaultPeriodTransportPeriodOutputPeriodPackage == defaultPeriodTransportPeriodOutputPeriodPackage &&
    other.defaultPeriodTransportPeriodReplicationPeriodSynchronous == defaultPeriodTransportPeriodReplicationPeriodSynchronous &&
    other.defaultPeriodTransportPeriodContentpackage == defaultPeriodTransportPeriodContentpackage &&
    other.offloadingPeriodTransporterPeriodDefaultPeriodEnabled == offloadingPeriodTransporterPeriodDefaultPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix == null ? 0 : defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix!.hashCode) +
    (defaultPeriodTransportPeriodAgentToMasterPeriodPrefix == null ? 0 : defaultPeriodTransportPeriodAgentToMasterPeriodPrefix!.hashCode) +
    (defaultPeriodTransportPeriodInputPeriodPackage == null ? 0 : defaultPeriodTransportPeriodInputPeriodPackage!.hashCode) +
    (defaultPeriodTransportPeriodOutputPeriodPackage == null ? 0 : defaultPeriodTransportPeriodOutputPeriodPackage!.hashCode) +
    (defaultPeriodTransportPeriodReplicationPeriodSynchronous == null ? 0 : defaultPeriodTransportPeriodReplicationPeriodSynchronous!.hashCode) +
    (defaultPeriodTransportPeriodContentpackage == null ? 0 : defaultPeriodTransportPeriodContentpackage!.hashCode) +
    (offloadingPeriodTransporterPeriodDefaultPeriodEnabled == null ? 0 : offloadingPeriodTransporterPeriodDefaultPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties[defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix=$defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix, defaultPeriodTransportPeriodAgentToMasterPeriodPrefix=$defaultPeriodTransportPeriodAgentToMasterPeriodPrefix, defaultPeriodTransportPeriodInputPeriodPackage=$defaultPeriodTransportPeriodInputPeriodPackage, defaultPeriodTransportPeriodOutputPeriodPackage=$defaultPeriodTransportPeriodOutputPeriodPackage, defaultPeriodTransportPeriodReplicationPeriodSynchronous=$defaultPeriodTransportPeriodReplicationPeriodSynchronous, defaultPeriodTransportPeriodContentpackage=$defaultPeriodTransportPeriodContentpackage, offloadingPeriodTransporterPeriodDefaultPeriodEnabled=$offloadingPeriodTransporterPeriodDefaultPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix != null) {
      json[r'default.transport.agent-to-worker.prefix'] = this.defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix;
    } else {
      json[r'default.transport.agent-to-worker.prefix'] = null;
    }
    if (this.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix != null) {
      json[r'default.transport.agent-to-master.prefix'] = this.defaultPeriodTransportPeriodAgentToMasterPeriodPrefix;
    } else {
      json[r'default.transport.agent-to-master.prefix'] = null;
    }
    if (this.defaultPeriodTransportPeriodInputPeriodPackage != null) {
      json[r'default.transport.input.package'] = this.defaultPeriodTransportPeriodInputPeriodPackage;
    } else {
      json[r'default.transport.input.package'] = null;
    }
    if (this.defaultPeriodTransportPeriodOutputPeriodPackage != null) {
      json[r'default.transport.output.package'] = this.defaultPeriodTransportPeriodOutputPeriodPackage;
    } else {
      json[r'default.transport.output.package'] = null;
    }
    if (this.defaultPeriodTransportPeriodReplicationPeriodSynchronous != null) {
      json[r'default.transport.replication.synchronous'] = this.defaultPeriodTransportPeriodReplicationPeriodSynchronous;
    } else {
      json[r'default.transport.replication.synchronous'] = null;
    }
    if (this.defaultPeriodTransportPeriodContentpackage != null) {
      json[r'default.transport.contentpackage'] = this.defaultPeriodTransportPeriodContentpackage;
    } else {
      json[r'default.transport.contentpackage'] = null;
    }
    if (this.offloadingPeriodTransporterPeriodDefaultPeriodEnabled != null) {
      json[r'offloading.transporter.default.enabled'] = this.offloadingPeriodTransporterPeriodDefaultPeriodEnabled;
    } else {
      json[r'offloading.transporter.default.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
        defaultPeriodTransportPeriodAgentToWorkerPeriodPrefix: ConfigNodePropertyString.fromJson(json[r'default.transport.agent-to-worker.prefix']),
        defaultPeriodTransportPeriodAgentToMasterPeriodPrefix: ConfigNodePropertyString.fromJson(json[r'default.transport.agent-to-master.prefix']),
        defaultPeriodTransportPeriodInputPeriodPackage: ConfigNodePropertyString.fromJson(json[r'default.transport.input.package']),
        defaultPeriodTransportPeriodOutputPeriodPackage: ConfigNodePropertyString.fromJson(json[r'default.transport.output.package']),
        defaultPeriodTransportPeriodReplicationPeriodSynchronous: ConfigNodePropertyBoolean.fromJson(json[r'default.transport.replication.synchronous']),
        defaultPeriodTransportPeriodContentpackage: ConfigNodePropertyBoolean.fromJson(json[r'default.transport.contentpackage']),
        offloadingPeriodTransporterPeriodDefaultPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'offloading.transporter.default.enabled']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

