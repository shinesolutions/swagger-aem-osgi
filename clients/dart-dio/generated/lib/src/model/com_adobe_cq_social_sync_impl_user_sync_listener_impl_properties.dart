//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_sync_impl_user_sync_listener_impl_properties.g.dart';

/// ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
///
/// Properties:
/// * [nodetypes] 
/// * [ignorableprops] 
/// * [ignorablenodes] 
/// * [enabled] 
/// * [distfolders] 
@BuiltValue()
abstract class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties implements Built<ComAdobeCqSocialSyncImplUserSyncListenerImplProperties, ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'nodetypes')
  ConfigNodePropertyArray? get nodetypes;

  @BuiltValueField(wireName: r'ignorableprops')
  ConfigNodePropertyArray? get ignorableprops;

  @BuiltValueField(wireName: r'ignorablenodes')
  ConfigNodePropertyArray? get ignorablenodes;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'distfolders')
  ConfigNodePropertyArray? get distfolders;

  ComAdobeCqSocialSyncImplUserSyncListenerImplProperties._();

  factory ComAdobeCqSocialSyncImplUserSyncListenerImplProperties([void updates(ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder b)]) = _$ComAdobeCqSocialSyncImplUserSyncListenerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSyncImplUserSyncListenerImplProperties> get serializer => _$ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesSerializer();
}

class _$ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSyncImplUserSyncListenerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSyncImplUserSyncListenerImplProperties, _$ComAdobeCqSocialSyncImplUserSyncListenerImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSyncImplUserSyncListenerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.nodetypes != null) {
      yield r'nodetypes';
      yield serializers.serialize(
        object.nodetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.ignorableprops != null) {
      yield r'ignorableprops';
      yield serializers.serialize(
        object.ignorableprops,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.ignorablenodes != null) {
      yield r'ignorablenodes';
      yield serializers.serialize(
        object.ignorablenodes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.distfolders != null) {
      yield r'distfolders';
      yield serializers.serialize(
        object.distfolders,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'nodetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.nodetypes.replace(valueDes);
          break;
        case r'ignorableprops':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignorableprops.replace(valueDes);
          break;
        case r'ignorablenodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignorablenodes.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'distfolders':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.distfolders.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSyncImplUserSyncListenerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSyncImplUserSyncListenerImplPropertiesBuilder();
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

