//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
  /// Returns a new [ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties] instance.
  ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties({
    this.eventPeriodFilter,
    this.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize,
    this.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority,
    this.launchesPeriodEventhandlerPeriodUpdatelastmodification,
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
  ConfigNodePropertyInteger? launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? launchesPeriodEventhandlerPeriodUpdatelastmodification;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties &&
    other.eventPeriodFilter == eventPeriodFilter &&
    other.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize == launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize &&
    other.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority == launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority &&
    other.launchesPeriodEventhandlerPeriodUpdatelastmodification == launchesPeriodEventhandlerPeriodUpdatelastmodification;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventPeriodFilter == null ? 0 : eventPeriodFilter!.hashCode) +
    (launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize == null ? 0 : launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize!.hashCode) +
    (launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority == null ? 0 : launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority!.hashCode) +
    (launchesPeriodEventhandlerPeriodUpdatelastmodification == null ? 0 : launchesPeriodEventhandlerPeriodUpdatelastmodification!.hashCode);

  @override
  String toString() => 'ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties[eventPeriodFilter=$eventPeriodFilter, launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize=$launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize, launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority=$launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority, launchesPeriodEventhandlerPeriodUpdatelastmodification=$launchesPeriodEventhandlerPeriodUpdatelastmodification]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventPeriodFilter != null) {
      json[r'event.filter'] = this.eventPeriodFilter;
    } else {
      json[r'event.filter'] = null;
    }
    if (this.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize != null) {
      json[r'launches.eventhandler.threadpool.maxsize'] = this.launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize;
    } else {
      json[r'launches.eventhandler.threadpool.maxsize'] = null;
    }
    if (this.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority != null) {
      json[r'launches.eventhandler.threadpool.priority'] = this.launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority;
    } else {
      json[r'launches.eventhandler.threadpool.priority'] = null;
    }
    if (this.launchesPeriodEventhandlerPeriodUpdatelastmodification != null) {
      json[r'launches.eventhandler.updatelastmodification'] = this.launchesPeriodEventhandlerPeriodUpdatelastmodification;
    } else {
      json[r'launches.eventhandler.updatelastmodification'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
        eventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'event.filter']),
        launchesPeriodEventhandlerPeriodThreadpoolPeriodMaxsize: ConfigNodePropertyInteger.fromJson(json[r'launches.eventhandler.threadpool.maxsize']),
        launchesPeriodEventhandlerPeriodThreadpoolPeriodPriority: ConfigNodePropertyDropDown.fromJson(json[r'launches.eventhandler.threadpool.priority']),
        launchesPeriodEventhandlerPeriodUpdatelastmodification: ConfigNodePropertyBoolean.fromJson(json[r'launches.eventhandler.updatelastmodification']),
      );
    }
    return null;
  }

  static List<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

