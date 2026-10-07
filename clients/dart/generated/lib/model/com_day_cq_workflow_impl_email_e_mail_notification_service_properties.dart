//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
  /// Returns a new [ComDayCqWorkflowImplEmailEMailNotificationServiceProperties] instance.
  ComDayCqWorkflowImplEmailEMailNotificationServiceProperties({
    this.fromPeriodAddress,
    this.hostPeriodPrefix,
    this.notifyPeriodOnabort,
    this.notifyPeriodOncomplete,
    this.notifyPeriodOncontainercomplete,
    this.notifyPeriodUseronly,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? fromPeriodAddress;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? hostPeriodPrefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? notifyPeriodOnabort;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? notifyPeriodOncomplete;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? notifyPeriodOncontainercomplete;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? notifyPeriodUseronly;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWorkflowImplEmailEMailNotificationServiceProperties &&
    other.fromPeriodAddress == fromPeriodAddress &&
    other.hostPeriodPrefix == hostPeriodPrefix &&
    other.notifyPeriodOnabort == notifyPeriodOnabort &&
    other.notifyPeriodOncomplete == notifyPeriodOncomplete &&
    other.notifyPeriodOncontainercomplete == notifyPeriodOncontainercomplete &&
    other.notifyPeriodUseronly == notifyPeriodUseronly;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fromPeriodAddress == null ? 0 : fromPeriodAddress!.hashCode) +
    (hostPeriodPrefix == null ? 0 : hostPeriodPrefix!.hashCode) +
    (notifyPeriodOnabort == null ? 0 : notifyPeriodOnabort!.hashCode) +
    (notifyPeriodOncomplete == null ? 0 : notifyPeriodOncomplete!.hashCode) +
    (notifyPeriodOncontainercomplete == null ? 0 : notifyPeriodOncontainercomplete!.hashCode) +
    (notifyPeriodUseronly == null ? 0 : notifyPeriodUseronly!.hashCode);

  @override
  String toString() => 'ComDayCqWorkflowImplEmailEMailNotificationServiceProperties[fromPeriodAddress=$fromPeriodAddress, hostPeriodPrefix=$hostPeriodPrefix, notifyPeriodOnabort=$notifyPeriodOnabort, notifyPeriodOncomplete=$notifyPeriodOncomplete, notifyPeriodOncontainercomplete=$notifyPeriodOncontainercomplete, notifyPeriodUseronly=$notifyPeriodUseronly]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fromPeriodAddress != null) {
      json[r'from.address'] = this.fromPeriodAddress;
    } else {
      json[r'from.address'] = null;
    }
    if (this.hostPeriodPrefix != null) {
      json[r'host.prefix'] = this.hostPeriodPrefix;
    } else {
      json[r'host.prefix'] = null;
    }
    if (this.notifyPeriodOnabort != null) {
      json[r'notify.onabort'] = this.notifyPeriodOnabort;
    } else {
      json[r'notify.onabort'] = null;
    }
    if (this.notifyPeriodOncomplete != null) {
      json[r'notify.oncomplete'] = this.notifyPeriodOncomplete;
    } else {
      json[r'notify.oncomplete'] = null;
    }
    if (this.notifyPeriodOncontainercomplete != null) {
      json[r'notify.oncontainercomplete'] = this.notifyPeriodOncontainercomplete;
    } else {
      json[r'notify.oncontainercomplete'] = null;
    }
    if (this.notifyPeriodUseronly != null) {
      json[r'notify.useronly'] = this.notifyPeriodUseronly;
    } else {
      json[r'notify.useronly'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWorkflowImplEmailEMailNotificationServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWorkflowImplEmailEMailNotificationServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
        fromPeriodAddress: ConfigNodePropertyString.fromJson(json[r'from.address']),
        hostPeriodPrefix: ConfigNodePropertyString.fromJson(json[r'host.prefix']),
        notifyPeriodOnabort: ConfigNodePropertyBoolean.fromJson(json[r'notify.onabort']),
        notifyPeriodOncomplete: ConfigNodePropertyBoolean.fromJson(json[r'notify.oncomplete']),
        notifyPeriodOncontainercomplete: ConfigNodePropertyBoolean.fromJson(json[r'notify.oncontainercomplete']),
        notifyPeriodUseronly: ConfigNodePropertyBoolean.fromJson(json[r'notify.useronly']),
      );
    }
    return null;
  }

  static List<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWorkflowImplEmailEMailNotificationServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

