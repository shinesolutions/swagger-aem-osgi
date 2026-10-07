//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {
  /// Returns a new [ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties] instance.
  ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties({
    this.filepattern,
    this.devicePeriodGroups,
    this.buildPeriodPagePeriodNodes,
    this.buildPeriodClientPeriodLibs,
    this.buildPeriodCanvasPeriodComponent,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? filepattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? devicePeriodGroups;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? buildPeriodPagePeriodNodes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? buildPeriodClientPeriodLibs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? buildPeriodCanvasPeriodComponent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties &&
    other.filepattern == filepattern &&
    other.devicePeriodGroups == devicePeriodGroups &&
    other.buildPeriodPagePeriodNodes == buildPeriodPagePeriodNodes &&
    other.buildPeriodClientPeriodLibs == buildPeriodClientPeriodLibs &&
    other.buildPeriodCanvasPeriodComponent == buildPeriodCanvasPeriodComponent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (filepattern == null ? 0 : filepattern!.hashCode) +
    (devicePeriodGroups == null ? 0 : devicePeriodGroups!.hashCode) +
    (buildPeriodPagePeriodNodes == null ? 0 : buildPeriodPagePeriodNodes!.hashCode) +
    (buildPeriodClientPeriodLibs == null ? 0 : buildPeriodClientPeriodLibs!.hashCode) +
    (buildPeriodCanvasPeriodComponent == null ? 0 : buildPeriodCanvasPeriodComponent!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties[filepattern=$filepattern, devicePeriodGroups=$devicePeriodGroups, buildPeriodPagePeriodNodes=$buildPeriodPagePeriodNodes, buildPeriodClientPeriodLibs=$buildPeriodClientPeriodLibs, buildPeriodCanvasPeriodComponent=$buildPeriodCanvasPeriodComponent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.filepattern != null) {
      json[r'filepattern'] = this.filepattern;
    } else {
      json[r'filepattern'] = null;
    }
    if (this.devicePeriodGroups != null) {
      json[r'device.groups'] = this.devicePeriodGroups;
    } else {
      json[r'device.groups'] = null;
    }
    if (this.buildPeriodPagePeriodNodes != null) {
      json[r'build.page.nodes'] = this.buildPeriodPagePeriodNodes;
    } else {
      json[r'build.page.nodes'] = null;
    }
    if (this.buildPeriodClientPeriodLibs != null) {
      json[r'build.client.libs'] = this.buildPeriodClientPeriodLibs;
    } else {
      json[r'build.client.libs'] = null;
    }
    if (this.buildPeriodCanvasPeriodComponent != null) {
      json[r'build.canvas.component'] = this.buildPeriodCanvasPeriodComponent;
    } else {
      json[r'build.canvas.component'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(
        filepattern: ConfigNodePropertyString.fromJson(json[r'filepattern']),
        devicePeriodGroups: ConfigNodePropertyArray.fromJson(json[r'device.groups']),
        buildPeriodPagePeriodNodes: ConfigNodePropertyBoolean.fromJson(json[r'build.page.nodes']),
        buildPeriodClientPeriodLibs: ConfigNodePropertyBoolean.fromJson(json[r'build.client.libs']),
        buildPeriodCanvasPeriodComponent: ConfigNodePropertyBoolean.fromJson(json[r'build.canvas.component']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

