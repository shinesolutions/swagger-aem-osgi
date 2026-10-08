//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
  /// Returns a new [ComDayCqDamCoreImplExpiryNotificationJobImplProperties] instance.
  ComDayCqDamCoreImplExpiryNotificationJobImplProperties({
    this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased,
    this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule,
    this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule,
    this.sendEmail,
    this.assetExpiredLimit,
    this.priorNotificationSeconds,
    this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? sendEmail;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? assetExpiredLimit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? priorNotificationSeconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplExpiryNotificationJobImplProperties &&
    other.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased == cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased &&
    other.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule == cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule &&
    other.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule == cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule &&
    other.sendEmail == sendEmail &&
    other.assetExpiredLimit == assetExpiredLimit &&
    other.priorNotificationSeconds == priorNotificationSeconds &&
    other.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol == cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased == null ? 0 : cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased!.hashCode) +
    (cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule == null ? 0 : cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule!.hashCode) +
    (cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule == null ? 0 : cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule!.hashCode) +
    (sendEmail == null ? 0 : sendEmail!.hashCode) +
    (assetExpiredLimit == null ? 0 : assetExpiredLimit!.hashCode) +
    (priorNotificationSeconds == null ? 0 : priorNotificationSeconds!.hashCode) +
    (cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol == null ? 0 : cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplExpiryNotificationJobImplProperties[cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased=$cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased, cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule=$cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule, cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule=$cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule, sendEmail=$sendEmail, assetExpiredLimit=$assetExpiredLimit, priorNotificationSeconds=$priorNotificationSeconds, cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol=$cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased != null) {
      json[r'cq.dam.expiry.notification.scheduler.istimebased'] = this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased;
    } else {
      json[r'cq.dam.expiry.notification.scheduler.istimebased'] = null;
    }
    if (this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule != null) {
      json[r'cq.dam.expiry.notification.scheduler.timebased.rule'] = this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;
    } else {
      json[r'cq.dam.expiry.notification.scheduler.timebased.rule'] = null;
    }
    if (this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule != null) {
      json[r'cq.dam.expiry.notification.scheduler.period.rule'] = this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;
    } else {
      json[r'cq.dam.expiry.notification.scheduler.period.rule'] = null;
    }
    if (this.sendEmail != null) {
      json[r'send_email'] = this.sendEmail;
    } else {
      json[r'send_email'] = null;
    }
    if (this.assetExpiredLimit != null) {
      json[r'asset_expired_limit'] = this.assetExpiredLimit;
    } else {
      json[r'asset_expired_limit'] = null;
    }
    if (this.priorNotificationSeconds != null) {
      json[r'prior_notification_seconds'] = this.priorNotificationSeconds;
    } else {
      json[r'prior_notification_seconds'] = null;
    }
    if (this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol != null) {
      json[r'cq.dam.expiry.notification.url.protocol'] = this.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol;
    } else {
      json[r'cq.dam.expiry.notification.url.protocol'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplExpiryNotificationJobImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplExpiryNotificationJobImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
        cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.expiry.notification.scheduler.istimebased']),
        cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule: ConfigNodePropertyString.fromJson(json[r'cq.dam.expiry.notification.scheduler.timebased.rule']),
        cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.expiry.notification.scheduler.period.rule']),
        sendEmail: ConfigNodePropertyBoolean.fromJson(json[r'send_email']),
        assetExpiredLimit: ConfigNodePropertyInteger.fromJson(json[r'asset_expired_limit']),
        priorNotificationSeconds: ConfigNodePropertyInteger.fromJson(json[r'prior_notification_seconds']),
        cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol: ConfigNodePropertyString.fromJson(json[r'cq.dam.expiry.notification.url.protocol']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplExpiryNotificationJobImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplExpiryNotificationJobImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplExpiryNotificationJobImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplExpiryNotificationJobImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplExpiryNotificationJobImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplExpiryNotificationJobImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplExpiryNotificationJobImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplExpiryNotificationJobImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplExpiryNotificationJobImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplExpiryNotificationJobImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

