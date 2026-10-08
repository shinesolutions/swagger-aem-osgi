//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReplicationImplReplicationReceiverImplProperties {
  /// Returns a new [ComDayCqReplicationImplReplicationReceiverImplProperties] instance.
  ComDayCqReplicationImplReplicationReceiverImplProperties({
    this.receiverPeriodTmpfilePeriodThreshold,
    this.receiverPeriodPackagesPeriodUsePeriodInstall,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? receiverPeriodTmpfilePeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? receiverPeriodPackagesPeriodUsePeriodInstall;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReplicationImplReplicationReceiverImplProperties &&
    other.receiverPeriodTmpfilePeriodThreshold == receiverPeriodTmpfilePeriodThreshold &&
    other.receiverPeriodPackagesPeriodUsePeriodInstall == receiverPeriodPackagesPeriodUsePeriodInstall;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (receiverPeriodTmpfilePeriodThreshold == null ? 0 : receiverPeriodTmpfilePeriodThreshold!.hashCode) +
    (receiverPeriodPackagesPeriodUsePeriodInstall == null ? 0 : receiverPeriodPackagesPeriodUsePeriodInstall!.hashCode);

  @override
  String toString() => 'ComDayCqReplicationImplReplicationReceiverImplProperties[receiverPeriodTmpfilePeriodThreshold=$receiverPeriodTmpfilePeriodThreshold, receiverPeriodPackagesPeriodUsePeriodInstall=$receiverPeriodPackagesPeriodUsePeriodInstall]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.receiverPeriodTmpfilePeriodThreshold != null) {
      json[r'receiver.tmpfile.threshold'] = this.receiverPeriodTmpfilePeriodThreshold;
    } else {
      json[r'receiver.tmpfile.threshold'] = null;
    }
    if (this.receiverPeriodPackagesPeriodUsePeriodInstall != null) {
      json[r'receiver.packages.use.install'] = this.receiverPeriodPackagesPeriodUsePeriodInstall;
    } else {
      json[r'receiver.packages.use.install'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReplicationImplReplicationReceiverImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReplicationImplReplicationReceiverImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReplicationImplReplicationReceiverImplProperties(
        receiverPeriodTmpfilePeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'receiver.tmpfile.threshold']),
        receiverPeriodPackagesPeriodUsePeriodInstall: ConfigNodePropertyBoolean.fromJson(json[r'receiver.packages.use.install']),
      );
    }
    return null;
  }

  static List<ComDayCqReplicationImplReplicationReceiverImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReplicationImplReplicationReceiverImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReplicationImplReplicationReceiverImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReplicationImplReplicationReceiverImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReplicationImplReplicationReceiverImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReplicationImplReplicationReceiverImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReplicationImplReplicationReceiverImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReplicationImplReplicationReceiverImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReplicationImplReplicationReceiverImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReplicationImplReplicationReceiverImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

