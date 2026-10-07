//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_core_payload_map_cache_properties.g.dart';

/// ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
///
/// Properties:
/// * [getSystemWorkflowModels] 
/// * [getPackageRootPath] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties implements Built<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties, ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder> {
  @BuiltValueField(wireName: r'getSystemWorkflowModels')
  ConfigNodePropertyArray? get getSystemWorkflowModels;

  @BuiltValueField(wireName: r'getPackageRootPath')
  ConfigNodePropertyString? get getPackageRootPath;

  ComAdobeGraniteWorkflowCorePayloadMapCacheProperties._();

  factory ComAdobeGraniteWorkflowCorePayloadMapCacheProperties([void updates(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowCorePayloadMapCacheProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties> get serializer => _$ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowCorePayloadMapCacheProperties, _$ComAdobeGraniteWorkflowCorePayloadMapCacheProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowCorePayloadMapCacheProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.getSystemWorkflowModels != null) {
      yield r'getSystemWorkflowModels';
      yield serializers.serialize(
        object.getSystemWorkflowModels,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.getPackageRootPath != null) {
      yield r'getPackageRootPath';
      yield serializers.serialize(
        object.getPackageRootPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'getSystemWorkflowModels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.getSystemWorkflowModels.replace(valueDes);
          break;
        case r'getPackageRootPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.getPackageRootPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowCorePayloadMapCacheProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder();
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

