//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_monitoring_impl_script_config_impl_properties.g.dart';

/// ComAdobeGraniteMonitoringImplScriptConfigImplProperties
///
/// Properties:
/// * [scriptPeriodFilename] 
/// * [scriptPeriodDisplay] 
/// * [scriptPeriodPath] 
/// * [scriptPeriodPlatform] 
/// * [interval] 
/// * [jmxdomain] 
@BuiltValue()
abstract class ComAdobeGraniteMonitoringImplScriptConfigImplProperties implements Built<ComAdobeGraniteMonitoringImplScriptConfigImplProperties, ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'script.filename')
  ConfigNodePropertyString? get scriptPeriodFilename;

  @BuiltValueField(wireName: r'script.display')
  ConfigNodePropertyString? get scriptPeriodDisplay;

  @BuiltValueField(wireName: r'script.path')
  ConfigNodePropertyString? get scriptPeriodPath;

  @BuiltValueField(wireName: r'script.platform')
  ConfigNodePropertyArray? get scriptPeriodPlatform;

  @BuiltValueField(wireName: r'interval')
  ConfigNodePropertyInteger? get interval;

  @BuiltValueField(wireName: r'jmxdomain')
  ConfigNodePropertyString? get jmxdomain;

  ComAdobeGraniteMonitoringImplScriptConfigImplProperties._();

  factory ComAdobeGraniteMonitoringImplScriptConfigImplProperties([void updates(ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder b)]) = _$ComAdobeGraniteMonitoringImplScriptConfigImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteMonitoringImplScriptConfigImplProperties> get serializer => _$ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesSerializer();
}

class _$ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteMonitoringImplScriptConfigImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteMonitoringImplScriptConfigImplProperties, _$ComAdobeGraniteMonitoringImplScriptConfigImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteMonitoringImplScriptConfigImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scriptPeriodFilename != null) {
      yield r'script.filename';
      yield serializers.serialize(
        object.scriptPeriodFilename,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scriptPeriodDisplay != null) {
      yield r'script.display';
      yield serializers.serialize(
        object.scriptPeriodDisplay,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scriptPeriodPath != null) {
      yield r'script.path';
      yield serializers.serialize(
        object.scriptPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scriptPeriodPlatform != null) {
      yield r'script.platform';
      yield serializers.serialize(
        object.scriptPeriodPlatform,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.interval != null) {
      yield r'interval';
      yield serializers.serialize(
        object.interval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.jmxdomain != null) {
      yield r'jmxdomain';
      yield serializers.serialize(
        object.jmxdomain,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'script.filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scriptPeriodFilename.replace(valueDes);
          break;
        case r'script.display':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scriptPeriodDisplay.replace(valueDes);
          break;
        case r'script.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scriptPeriodPath.replace(valueDes);
          break;
        case r'script.platform':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.scriptPeriodPlatform.replace(valueDes);
          break;
        case r'interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.interval.replace(valueDes);
          break;
        case r'jmxdomain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jmxdomain.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteMonitoringImplScriptConfigImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder();
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

