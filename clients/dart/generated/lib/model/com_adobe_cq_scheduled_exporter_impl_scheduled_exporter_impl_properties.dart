//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {
  /// Returns a new [ComAdobeCqScheduledExporterImplScheduledExporterImplProperties] instance.
  ComAdobeCqScheduledExporterImplScheduledExporterImplProperties({
    this.includePeriodPaths,
    this.exporterPeriodUser,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? includePeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? exporterPeriodUser;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqScheduledExporterImplScheduledExporterImplProperties &&
    other.includePeriodPaths == includePeriodPaths &&
    other.exporterPeriodUser == exporterPeriodUser;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (includePeriodPaths == null ? 0 : includePeriodPaths!.hashCode) +
    (exporterPeriodUser == null ? 0 : exporterPeriodUser!.hashCode);

  @override
  String toString() => 'ComAdobeCqScheduledExporterImplScheduledExporterImplProperties[includePeriodPaths=$includePeriodPaths, exporterPeriodUser=$exporterPeriodUser]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.includePeriodPaths != null) {
      json[r'include.paths'] = this.includePeriodPaths;
    } else {
      json[r'include.paths'] = null;
    }
    if (this.exporterPeriodUser != null) {
      json[r'exporter.user'] = this.exporterPeriodUser;
    } else {
      json[r'exporter.user'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqScheduledExporterImplScheduledExporterImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqScheduledExporterImplScheduledExporterImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(
        includePeriodPaths: ConfigNodePropertyArray.fromJson(json[r'include.paths']),
        exporterPeriodUser: ConfigNodePropertyString.fromJson(json[r'exporter.user']),
      );
    }
    return null;
  }

  static List<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqScheduledExporterImplScheduledExporterImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqScheduledExporterImplScheduledExporterImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqScheduledExporterImplScheduledExporterImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqScheduledExporterImplScheduledExporterImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

