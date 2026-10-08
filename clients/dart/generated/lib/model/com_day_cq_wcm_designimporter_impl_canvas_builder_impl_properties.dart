//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {
  /// Returns a new [ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties] instance.
  ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties({
    this.filepattern,
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
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties &&
    other.filepattern == filepattern &&
    other.buildPeriodPagePeriodNodes == buildPeriodPagePeriodNodes &&
    other.buildPeriodClientPeriodLibs == buildPeriodClientPeriodLibs &&
    other.buildPeriodCanvasPeriodComponent == buildPeriodCanvasPeriodComponent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (filepattern == null ? 0 : filepattern!.hashCode) +
    (buildPeriodPagePeriodNodes == null ? 0 : buildPeriodPagePeriodNodes!.hashCode) +
    (buildPeriodClientPeriodLibs == null ? 0 : buildPeriodClientPeriodLibs!.hashCode) +
    (buildPeriodCanvasPeriodComponent == null ? 0 : buildPeriodCanvasPeriodComponent!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties[filepattern=$filepattern, buildPeriodPagePeriodNodes=$buildPeriodPagePeriodNodes, buildPeriodClientPeriodLibs=$buildPeriodClientPeriodLibs, buildPeriodCanvasPeriodComponent=$buildPeriodCanvasPeriodComponent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.filepattern != null) {
      json[r'filepattern'] = this.filepattern;
    } else {
      json[r'filepattern'] = null;
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

  /// Returns a new [ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
        filepattern: ConfigNodePropertyString.fromJson(json[r'filepattern']),
        buildPeriodPagePeriodNodes: ConfigNodePropertyBoolean.fromJson(json[r'build.page.nodes']),
        buildPeriodClientPeriodLibs: ConfigNodePropertyBoolean.fromJson(json[r'build.client.libs']),
        buildPeriodCanvasPeriodComponent: ConfigNodePropertyBoolean.fromJson(json[r'build.canvas.component']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

