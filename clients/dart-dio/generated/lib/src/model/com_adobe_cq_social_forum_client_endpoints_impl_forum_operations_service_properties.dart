//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service_properties.g.dart';

/// ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
///
/// Properties:
/// * [fieldWhitelist] 
/// * [attachmentTypeBlacklist] 
@BuiltValue()
abstract class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties implements Built<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyArray? get attachmentTypeBlacklist;

  ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties._();

  factory ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties([void updates(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder b)]) = _$ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties> get serializer => _$ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesSerializer();
}

class _$ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties, _$ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties];

  @override
  final String wireName = r'ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.attachmentTypeBlacklist != null) {
      yield r'attachmentTypeBlacklist';
      yield serializers.serialize(
        object.attachmentTypeBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'fieldWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fieldWhitelist.replace(valueDes);
          break;
        case r'attachmentTypeBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.attachmentTypeBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesBuilder();
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

