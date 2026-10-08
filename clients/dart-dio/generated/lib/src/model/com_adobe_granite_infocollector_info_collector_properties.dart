//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_infocollector_info_collector_properties.g.dart';

/// ComAdobeGraniteInfocollectorInfoCollectorProperties
///
/// Properties:
/// * [granitePeriodInfocollectorPeriodIncludeThreadDumps] 
/// * [granitePeriodInfocollectorPeriodIncludeHeapDump] 
@BuiltValue()
abstract class ComAdobeGraniteInfocollectorInfoCollectorProperties implements Built<ComAdobeGraniteInfocollectorInfoCollectorProperties, ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder> {
  @BuiltValueField(wireName: r'granite.infocollector.includeThreadDumps')
  ConfigNodePropertyBoolean? get granitePeriodInfocollectorPeriodIncludeThreadDumps;

  @BuiltValueField(wireName: r'granite.infocollector.includeHeapDump')
  ConfigNodePropertyBoolean? get granitePeriodInfocollectorPeriodIncludeHeapDump;

  ComAdobeGraniteInfocollectorInfoCollectorProperties._();

  factory ComAdobeGraniteInfocollectorInfoCollectorProperties([void updates(ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder b)]) = _$ComAdobeGraniteInfocollectorInfoCollectorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteInfocollectorInfoCollectorProperties> get serializer => _$ComAdobeGraniteInfocollectorInfoCollectorPropertiesSerializer();
}

class _$ComAdobeGraniteInfocollectorInfoCollectorPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteInfocollectorInfoCollectorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteInfocollectorInfoCollectorProperties, _$ComAdobeGraniteInfocollectorInfoCollectorProperties];

  @override
  final String wireName = r'ComAdobeGraniteInfocollectorInfoCollectorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteInfocollectorInfoCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.granitePeriodInfocollectorPeriodIncludeThreadDumps != null) {
      yield r'granite.infocollector.includeThreadDumps';
      yield serializers.serialize(
        object.granitePeriodInfocollectorPeriodIncludeThreadDumps,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.granitePeriodInfocollectorPeriodIncludeHeapDump != null) {
      yield r'granite.infocollector.includeHeapDump';
      yield serializers.serialize(
        object.granitePeriodInfocollectorPeriodIncludeHeapDump,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteInfocollectorInfoCollectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'granite.infocollector.includeThreadDumps':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodInfocollectorPeriodIncludeThreadDumps.replace(valueDes);
          break;
        case r'granite.infocollector.includeHeapDump':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.granitePeriodInfocollectorPeriodIncludeHeapDump.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteInfocollectorInfoCollectorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteInfocollectorInfoCollectorPropertiesBuilder();
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

