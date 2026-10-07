//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
  /// Returns a new [ComAdobeGraniteThreaddumpThreadDumpCollectorProperties] instance.
  ComAdobeGraniteThreaddumpThreadDumpCollectorProperties({
    this.schedulerPeriodPeriod,
    this.schedulerPeriodRunOn,
    this.granitePeriodThreaddumpPeriodEnabled,
    this.granitePeriodThreaddumpPeriodDumpsPerFile,
    this.granitePeriodThreaddumpPeriodEnableGzipCompression,
    this.granitePeriodThreaddumpPeriodEnableDirectoriesCompression,
    this.granitePeriodThreaddumpPeriodEnableJStack,
    this.granitePeriodThreaddumpPeriodMaxBackupDays,
    this.granitePeriodThreaddumpPeriodBackupCleanTrigger,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? schedulerPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? schedulerPeriodRunOn;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodThreaddumpPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? granitePeriodThreaddumpPeriodDumpsPerFile;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodThreaddumpPeriodEnableGzipCompression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodThreaddumpPeriodEnableDirectoriesCompression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodThreaddumpPeriodEnableJStack;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? granitePeriodThreaddumpPeriodMaxBackupDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? granitePeriodThreaddumpPeriodBackupCleanTrigger;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteThreaddumpThreadDumpCollectorProperties &&
    other.schedulerPeriodPeriod == schedulerPeriodPeriod &&
    other.schedulerPeriodRunOn == schedulerPeriodRunOn &&
    other.granitePeriodThreaddumpPeriodEnabled == granitePeriodThreaddumpPeriodEnabled &&
    other.granitePeriodThreaddumpPeriodDumpsPerFile == granitePeriodThreaddumpPeriodDumpsPerFile &&
    other.granitePeriodThreaddumpPeriodEnableGzipCompression == granitePeriodThreaddumpPeriodEnableGzipCompression &&
    other.granitePeriodThreaddumpPeriodEnableDirectoriesCompression == granitePeriodThreaddumpPeriodEnableDirectoriesCompression &&
    other.granitePeriodThreaddumpPeriodEnableJStack == granitePeriodThreaddumpPeriodEnableJStack &&
    other.granitePeriodThreaddumpPeriodMaxBackupDays == granitePeriodThreaddumpPeriodMaxBackupDays &&
    other.granitePeriodThreaddumpPeriodBackupCleanTrigger == granitePeriodThreaddumpPeriodBackupCleanTrigger;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodPeriod == null ? 0 : schedulerPeriodPeriod!.hashCode) +
    (schedulerPeriodRunOn == null ? 0 : schedulerPeriodRunOn!.hashCode) +
    (granitePeriodThreaddumpPeriodEnabled == null ? 0 : granitePeriodThreaddumpPeriodEnabled!.hashCode) +
    (granitePeriodThreaddumpPeriodDumpsPerFile == null ? 0 : granitePeriodThreaddumpPeriodDumpsPerFile!.hashCode) +
    (granitePeriodThreaddumpPeriodEnableGzipCompression == null ? 0 : granitePeriodThreaddumpPeriodEnableGzipCompression!.hashCode) +
    (granitePeriodThreaddumpPeriodEnableDirectoriesCompression == null ? 0 : granitePeriodThreaddumpPeriodEnableDirectoriesCompression!.hashCode) +
    (granitePeriodThreaddumpPeriodEnableJStack == null ? 0 : granitePeriodThreaddumpPeriodEnableJStack!.hashCode) +
    (granitePeriodThreaddumpPeriodMaxBackupDays == null ? 0 : granitePeriodThreaddumpPeriodMaxBackupDays!.hashCode) +
    (granitePeriodThreaddumpPeriodBackupCleanTrigger == null ? 0 : granitePeriodThreaddumpPeriodBackupCleanTrigger!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteThreaddumpThreadDumpCollectorProperties[schedulerPeriodPeriod=$schedulerPeriodPeriod, schedulerPeriodRunOn=$schedulerPeriodRunOn, granitePeriodThreaddumpPeriodEnabled=$granitePeriodThreaddumpPeriodEnabled, granitePeriodThreaddumpPeriodDumpsPerFile=$granitePeriodThreaddumpPeriodDumpsPerFile, granitePeriodThreaddumpPeriodEnableGzipCompression=$granitePeriodThreaddumpPeriodEnableGzipCompression, granitePeriodThreaddumpPeriodEnableDirectoriesCompression=$granitePeriodThreaddumpPeriodEnableDirectoriesCompression, granitePeriodThreaddumpPeriodEnableJStack=$granitePeriodThreaddumpPeriodEnableJStack, granitePeriodThreaddumpPeriodMaxBackupDays=$granitePeriodThreaddumpPeriodMaxBackupDays, granitePeriodThreaddumpPeriodBackupCleanTrigger=$granitePeriodThreaddumpPeriodBackupCleanTrigger]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodPeriod != null) {
      json[r'scheduler.period'] = this.schedulerPeriodPeriod;
    } else {
      json[r'scheduler.period'] = null;
    }
    if (this.schedulerPeriodRunOn != null) {
      json[r'scheduler.runOn'] = this.schedulerPeriodRunOn;
    } else {
      json[r'scheduler.runOn'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodEnabled != null) {
      json[r'granite.threaddump.enabled'] = this.granitePeriodThreaddumpPeriodEnabled;
    } else {
      json[r'granite.threaddump.enabled'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodDumpsPerFile != null) {
      json[r'granite.threaddump.dumpsPerFile'] = this.granitePeriodThreaddumpPeriodDumpsPerFile;
    } else {
      json[r'granite.threaddump.dumpsPerFile'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodEnableGzipCompression != null) {
      json[r'granite.threaddump.enableGzipCompression'] = this.granitePeriodThreaddumpPeriodEnableGzipCompression;
    } else {
      json[r'granite.threaddump.enableGzipCompression'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodEnableDirectoriesCompression != null) {
      json[r'granite.threaddump.enableDirectoriesCompression'] = this.granitePeriodThreaddumpPeriodEnableDirectoriesCompression;
    } else {
      json[r'granite.threaddump.enableDirectoriesCompression'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodEnableJStack != null) {
      json[r'granite.threaddump.enableJStack'] = this.granitePeriodThreaddumpPeriodEnableJStack;
    } else {
      json[r'granite.threaddump.enableJStack'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodMaxBackupDays != null) {
      json[r'granite.threaddump.maxBackupDays'] = this.granitePeriodThreaddumpPeriodMaxBackupDays;
    } else {
      json[r'granite.threaddump.maxBackupDays'] = null;
    }
    if (this.granitePeriodThreaddumpPeriodBackupCleanTrigger != null) {
      json[r'granite.threaddump.backupCleanTrigger'] = this.granitePeriodThreaddumpPeriodBackupCleanTrigger;
    } else {
      json[r'granite.threaddump.backupCleanTrigger'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteThreaddumpThreadDumpCollectorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteThreaddumpThreadDumpCollectorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
        schedulerPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'scheduler.period']),
        schedulerPeriodRunOn: ConfigNodePropertyDropDown.fromJson(json[r'scheduler.runOn']),
        granitePeriodThreaddumpPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'granite.threaddump.enabled']),
        granitePeriodThreaddumpPeriodDumpsPerFile: ConfigNodePropertyInteger.fromJson(json[r'granite.threaddump.dumpsPerFile']),
        granitePeriodThreaddumpPeriodEnableGzipCompression: ConfigNodePropertyBoolean.fromJson(json[r'granite.threaddump.enableGzipCompression']),
        granitePeriodThreaddumpPeriodEnableDirectoriesCompression: ConfigNodePropertyBoolean.fromJson(json[r'granite.threaddump.enableDirectoriesCompression']),
        granitePeriodThreaddumpPeriodEnableJStack: ConfigNodePropertyBoolean.fromJson(json[r'granite.threaddump.enableJStack']),
        granitePeriodThreaddumpPeriodMaxBackupDays: ConfigNodePropertyInteger.fromJson(json[r'granite.threaddump.maxBackupDays']),
        granitePeriodThreaddumpPeriodBackupCleanTrigger: ConfigNodePropertyString.fromJson(json[r'granite.threaddump.backupCleanTrigger']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteThreaddumpThreadDumpCollectorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteThreaddumpThreadDumpCollectorProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

