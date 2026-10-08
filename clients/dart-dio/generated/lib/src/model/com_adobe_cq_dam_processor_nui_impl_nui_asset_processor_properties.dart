//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties.g.dart';

/// ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
///
/// Properties:
/// * [nuiEnabled] 
/// * [nuiServiceUrl] 
/// * [nuiApiKey] 
@BuiltValue()
abstract class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties implements Built<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'nuiEnabled')
  ConfigNodePropertyBoolean? get nuiEnabled;

  @BuiltValueField(wireName: r'nuiServiceUrl')
  ConfigNodePropertyString? get nuiServiceUrl;

  @BuiltValueField(wireName: r'nuiApiKey')
  ConfigNodePropertyString? get nuiApiKey;

  ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties._();

  factory ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties([void updates(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder b)]) = _$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties> get serializer => _$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesSerializer();
}

class _$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties, _$ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties];

  @override
  final String wireName = r'ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.nuiEnabled != null) {
      yield r'nuiEnabled';
      yield serializers.serialize(
        object.nuiEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.nuiServiceUrl != null) {
      yield r'nuiServiceUrl';
      yield serializers.serialize(
        object.nuiServiceUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.nuiApiKey != null) {
      yield r'nuiApiKey';
      yield serializers.serialize(
        object.nuiApiKey,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'nuiEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.nuiEnabled.replace(valueDes);
          break;
        case r'nuiServiceUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.nuiServiceUrl.replace(valueDes);
          break;
        case r'nuiApiKey':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.nuiApiKey.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesBuilder();
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

