//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
  /// Returns a new [ComDayCqDamCoreImplMissingMetadataNotificationJobProperties] instance.
  ComDayCqDamCoreImplMissingMetadataNotificationJobProperties({
    this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased,
    this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule,
    this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule,
    this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplMissingMetadataNotificationJobProperties &&
    other.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased == cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased &&
    other.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule == cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule &&
    other.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule == cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule &&
    other.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient == cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased == null ? 0 : cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased!.hashCode) +
    (cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule == null ? 0 : cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule!.hashCode) +
    (cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule == null ? 0 : cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule!.hashCode) +
    (cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient == null ? 0 : cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplMissingMetadataNotificationJobProperties[cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased=$cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased, cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule=$cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule, cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule=$cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule, cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient=$cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased != null) {
      json[r'cq.dam.missingmetadata.notification.scheduler.istimebased'] = this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased;
    } else {
      json[r'cq.dam.missingmetadata.notification.scheduler.istimebased'] = null;
    }
    if (this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule != null) {
      json[r'cq.dam.missingmetadata.notification.scheduler.timebased.rule'] = this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;
    } else {
      json[r'cq.dam.missingmetadata.notification.scheduler.timebased.rule'] = null;
    }
    if (this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule != null) {
      json[r'cq.dam.missingmetadata.notification.scheduler.period.rule'] = this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;
    } else {
      json[r'cq.dam.missingmetadata.notification.scheduler.period.rule'] = null;
    }
    if (this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient != null) {
      json[r'cq.dam.missingmetadata.notification.recipient'] = this.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient;
    } else {
      json[r'cq.dam.missingmetadata.notification.recipient'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplMissingMetadataNotificationJobProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplMissingMetadataNotificationJobProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(
        cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.missingmetadata.notification.scheduler.istimebased']),
        cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule: ConfigNodePropertyString.fromJson(json[r'cq.dam.missingmetadata.notification.scheduler.timebased.rule']),
        cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.missingmetadata.notification.scheduler.period.rule']),
        cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient: ConfigNodePropertyString.fromJson(json[r'cq.dam.missingmetadata.notification.recipient']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplMissingMetadataNotificationJobProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplMissingMetadataNotificationJobProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplMissingMetadataNotificationJobProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

