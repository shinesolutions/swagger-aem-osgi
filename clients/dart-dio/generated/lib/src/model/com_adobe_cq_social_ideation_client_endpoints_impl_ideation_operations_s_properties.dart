//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s_properties.g.dart';

/// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
///
/// Properties:
/// * [fieldWhitelist] 
/// * [attachmentTypeBlacklist] 
@BuiltValue()
abstract class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties implements Built<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyArray? get attachmentTypeBlacklist;

  ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties._();

  factory ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties([void updates(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder b)]) = _$ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties> get serializer => _$ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesSerializer();
}

class _$ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties, _$ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties];

  @override
  final String wireName = r'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties object, {
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
    ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder result,
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
  ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesBuilder();
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

