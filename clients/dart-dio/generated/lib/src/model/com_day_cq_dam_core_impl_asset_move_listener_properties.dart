//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_asset_move_listener_properties.g.dart';

/// ComDayCqDamCoreImplAssetMoveListenerProperties
///
/// Properties:
/// * [enabled] 
@BuiltValue()
abstract class ComDayCqDamCoreImplAssetMoveListenerProperties implements Built<ComDayCqDamCoreImplAssetMoveListenerProperties, ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  ComDayCqDamCoreImplAssetMoveListenerProperties._();

  factory ComDayCqDamCoreImplAssetMoveListenerProperties([void updates(ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder b)]) = _$ComDayCqDamCoreImplAssetMoveListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplAssetMoveListenerProperties> get serializer => _$ComDayCqDamCoreImplAssetMoveListenerPropertiesSerializer();
}

class _$ComDayCqDamCoreImplAssetMoveListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplAssetMoveListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplAssetMoveListenerProperties, _$ComDayCqDamCoreImplAssetMoveListenerProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplAssetMoveListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplAssetMoveListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplAssetMoveListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplAssetMoveListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder();
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

