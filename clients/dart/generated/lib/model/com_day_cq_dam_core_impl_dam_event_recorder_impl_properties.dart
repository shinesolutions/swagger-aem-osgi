//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplDamEventRecorderImplProperties {
  /// Returns a new [ComDayCqDamCoreImplDamEventRecorderImplProperties] instance.
  ComDayCqDamCoreImplDamEventRecorderImplProperties({
    this.eventPeriodFilter,
    this.eventPeriodQueuePeriodLength,
    this.eventrecorderPeriodEnabled,
    this.eventrecorderPeriodBlacklist,
    this.eventrecorderPeriodEventtypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? eventPeriodFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? eventPeriodQueuePeriodLength;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? eventrecorderPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? eventrecorderPeriodBlacklist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? eventrecorderPeriodEventtypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplDamEventRecorderImplProperties &&
    other.eventPeriodFilter == eventPeriodFilter &&
    other.eventPeriodQueuePeriodLength == eventPeriodQueuePeriodLength &&
    other.eventrecorderPeriodEnabled == eventrecorderPeriodEnabled &&
    other.eventrecorderPeriodBlacklist == eventrecorderPeriodBlacklist &&
    other.eventrecorderPeriodEventtypes == eventrecorderPeriodEventtypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventPeriodFilter == null ? 0 : eventPeriodFilter!.hashCode) +
    (eventPeriodQueuePeriodLength == null ? 0 : eventPeriodQueuePeriodLength!.hashCode) +
    (eventrecorderPeriodEnabled == null ? 0 : eventrecorderPeriodEnabled!.hashCode) +
    (eventrecorderPeriodBlacklist == null ? 0 : eventrecorderPeriodBlacklist!.hashCode) +
    (eventrecorderPeriodEventtypes == null ? 0 : eventrecorderPeriodEventtypes!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplDamEventRecorderImplProperties[eventPeriodFilter=$eventPeriodFilter, eventPeriodQueuePeriodLength=$eventPeriodQueuePeriodLength, eventrecorderPeriodEnabled=$eventrecorderPeriodEnabled, eventrecorderPeriodBlacklist=$eventrecorderPeriodBlacklist, eventrecorderPeriodEventtypes=$eventrecorderPeriodEventtypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventPeriodFilter != null) {
      json[r'event.filter'] = this.eventPeriodFilter;
    } else {
      json[r'event.filter'] = null;
    }
    if (this.eventPeriodQueuePeriodLength != null) {
      json[r'event.queue.length'] = this.eventPeriodQueuePeriodLength;
    } else {
      json[r'event.queue.length'] = null;
    }
    if (this.eventrecorderPeriodEnabled != null) {
      json[r'eventrecorder.enabled'] = this.eventrecorderPeriodEnabled;
    } else {
      json[r'eventrecorder.enabled'] = null;
    }
    if (this.eventrecorderPeriodBlacklist != null) {
      json[r'eventrecorder.blacklist'] = this.eventrecorderPeriodBlacklist;
    } else {
      json[r'eventrecorder.blacklist'] = null;
    }
    if (this.eventrecorderPeriodEventtypes != null) {
      json[r'eventrecorder.eventtypes'] = this.eventrecorderPeriodEventtypes;
    } else {
      json[r'eventrecorder.eventtypes'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplDamEventRecorderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplDamEventRecorderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplDamEventRecorderImplProperties(
        eventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'event.filter']),
        eventPeriodQueuePeriodLength: ConfigNodePropertyInteger.fromJson(json[r'event.queue.length']),
        eventrecorderPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'eventrecorder.enabled']),
        eventrecorderPeriodBlacklist: ConfigNodePropertyArray.fromJson(json[r'eventrecorder.blacklist']),
        eventrecorderPeriodEventtypes: ConfigNodePropertyDropDown.fromJson(json[r'eventrecorder.eventtypes']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplDamEventRecorderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplDamEventRecorderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplDamEventRecorderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplDamEventRecorderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplDamEventRecorderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplDamEventRecorderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplDamEventRecorderImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplDamEventRecorderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplDamEventRecorderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplDamEventRecorderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

