//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_threaddump_thread_dump_collector_properties.g.dart';

/// ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
///
/// Properties:
/// * [schedulerPeriodPeriod] 
/// * [schedulerPeriodRunOn] 
/// * [granitePeriodThreaddumpPeriodEnabled] 
/// * [granitePeriodThreaddumpPeriodDumpsPerFile] 
/// * [granitePeriodThreaddumpPeriodEnableGzipCompression] 
/// * [granitePeriodThreaddumpPeriodEnableDirectoriesCompression] 
/// * [granitePeriodThreaddumpPeriodEnableJStack] 
/// * [granitePeriodThreaddumpPeriodMaxBackupDays] 
/// * [granitePeriodThreaddumpPeriodBackupCleanTrigger] 
@BuiltValue()
abstract class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties implements Built<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties, ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.period')
  ConfigNodePropertyInteger? get schedulerPeriodPeriod;

  @BuiltValueField(wireName: r'scheduler.runOn')
  ConfigNodePropertyDropDown? get schedulerPeriodRunOn;

  @BuiltValueField(wireName: r'granite.threaddump.enabled')
  ConfigNodePropertyBoolean? get granitePeriodThreaddumpPeriodEnabled;

  @BuiltValueField(wireName: r'granite.threaddump.dumpsPerFile')
  ConfigNodePropertyInteger? get granitePeriodThreaddumpPeriodDumpsPerFile;

  @BuiltValueField(wireName: r'granite.threaddump.enableGzipCompression')
  ConfigNodePropertyBoolean? get granitePeriodThreaddumpPeriodEnableGzipCompression;

  @BuiltValueField(wireName: r'granite.threaddump.enableDirectoriesCompression')
  ConfigNodePropertyBoolean? get granitePeriodThreaddumpPeriodEnableDirectoriesCompression;

  @BuiltValueField(wireName: r'granite.threaddump.enableJStack')
  ConfigNodePropertyBoolean? get granitePeriodThreaddumpPeriodEnableJStack;

  @BuiltValueField(wireName: r'granite.threaddump.maxBackupDays')
  ConfigNodePropertyInteger? get granitePeriodThreaddumpPeriodMaxBackupDays;

  @BuiltValueField(wireName: r'granite.threaddump.backupCleanTrigger')
  ConfigNodePropertyString? get granitePeriodThreaddumpPeriodBackupCleanTrigger;

  ComAdobeGraniteThreaddumpThreadDumpCollectorProperties._();

  factory ComAdobeGraniteThreaddumpThreadDumpCollectorProperties([void updates(ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder b)]) = _$ComAdobeGraniteThreaddumpThreadDumpCollectorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties> get serializer => _$ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesSerializer();
}

class _$ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteThreaddumpThreadDumpCollectorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteThreaddumpThreadDumpCollectorProperties, _$ComAdobeGraniteThreaddumpThreadDumpCollectorProperties];

  @override
  final String wireName = r'ComAdobeGraniteThreaddumpThreadDumpCollectorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodPeriod != null) {
      yield r'scheduler.period';
      yield serializers.serialize(
        object.schedulerPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.schedulerPeriodRunOn != null) {
      yield r'scheduler.runOn';
      yield serializers.serialize(
        object.schedulerPeriodRunOn,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.granitePeriodThreaddumpPeriodEnabled != null) {
      yield r'granite.threaddump.enabled';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodThreaddumpPeriodDumpsPerFile != null) {
      yield r'granite.threaddump.dumpsPerFile';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodDumpsPerFile,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.granitePeriodThreaddumpPeriodEnableGzipCompression != null) {
      yield r'granite.threaddump.enableGzipCompression';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodEnableGzipCompression,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodThreaddumpPeriodEnableDirectoriesCompression != null) {
      yield r'granite.threaddump.enableDirectoriesCompression';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodEnableDirectoriesCompression,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodThreaddumpPeriodEnableJStack != null) {
      yield r'granite.threaddump.enableJStack';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodEnableJStack,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodThreaddumpPeriodMaxBackupDays != null) {
      yield r'granite.threaddump.maxBackupDays';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodMaxBackupDays,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.granitePeriodThreaddumpPeriodBackupCleanTrigger != null) {
      yield r'granite.threaddump.backupCleanTrigger';
      yield serializers.serialize(
        object.granitePeriodThreaddumpPeriodBackupCleanTrigger,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.schedulerPeriodPeriod.replace(valueDes);
          break;
        case r'scheduler.runOn':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.schedulerPeriodRunOn.replace(valueDes);
          break;
        case r'granite.threaddump.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodEnabled.replace(valueDes);
          break;
        case r'granite.threaddump.dumpsPerFile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodDumpsPerFile.replace(valueDes);
          break;
        case r'granite.threaddump.enableGzipCompression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodEnableGzipCompression.replace(valueDes);
          break;
        case r'granite.threaddump.enableDirectoriesCompression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodEnableDirectoriesCompression.replace(valueDes);
          break;
        case r'granite.threaddump.enableJStack':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodEnableJStack.replace(valueDes);
          break;
        case r'granite.threaddump.maxBackupDays':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodMaxBackupDays.replace(valueDes);
          break;
        case r'granite.threaddump.backupCleanTrigger':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.granitePeriodThreaddumpPeriodBackupCleanTrigger.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteThreaddumpThreadDumpCollectorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

