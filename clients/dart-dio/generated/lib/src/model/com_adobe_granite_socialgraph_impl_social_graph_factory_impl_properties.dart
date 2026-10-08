//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties.g.dart';

/// ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
///
/// Properties:
/// * [group2memberPeriodRelationshipPeriodOutgoing] 
/// * [group2memberPeriodExcludedPeriodOutgoing] 
/// * [group2memberPeriodRelationshipPeriodIncoming] 
/// * [group2memberPeriodExcludedPeriodIncoming] 
@BuiltValue()
abstract class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties implements Built<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'group2member.relationship.outgoing')
  ConfigNodePropertyString? get group2memberPeriodRelationshipPeriodOutgoing;

  @BuiltValueField(wireName: r'group2member.excluded.outgoing')
  ConfigNodePropertyArray? get group2memberPeriodExcludedPeriodOutgoing;

  @BuiltValueField(wireName: r'group2member.relationship.incoming')
  ConfigNodePropertyString? get group2memberPeriodRelationshipPeriodIncoming;

  @BuiltValueField(wireName: r'group2member.excluded.incoming')
  ConfigNodePropertyArray? get group2memberPeriodExcludedPeriodIncoming;

  ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties._();

  factory ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties([void updates(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder b)]) = _$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties> get serializer => _$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesSerializer();
}

class _$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties, _$ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.group2memberPeriodRelationshipPeriodOutgoing != null) {
      yield r'group2member.relationship.outgoing';
      yield serializers.serialize(
        object.group2memberPeriodRelationshipPeriodOutgoing,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.group2memberPeriodExcludedPeriodOutgoing != null) {
      yield r'group2member.excluded.outgoing';
      yield serializers.serialize(
        object.group2memberPeriodExcludedPeriodOutgoing,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.group2memberPeriodRelationshipPeriodIncoming != null) {
      yield r'group2member.relationship.incoming';
      yield serializers.serialize(
        object.group2memberPeriodRelationshipPeriodIncoming,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.group2memberPeriodExcludedPeriodIncoming != null) {
      yield r'group2member.excluded.incoming';
      yield serializers.serialize(
        object.group2memberPeriodExcludedPeriodIncoming,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'group2member.relationship.outgoing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.group2memberPeriodRelationshipPeriodOutgoing.replace(valueDes);
          break;
        case r'group2member.excluded.outgoing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.group2memberPeriodExcludedPeriodOutgoing.replace(valueDes);
          break;
        case r'group2member.relationship.incoming':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.group2memberPeriodRelationshipPeriodIncoming.replace(valueDes);
          break;
        case r'group2member.excluded.incoming':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.group2memberPeriodExcludedPeriodIncoming.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesBuilder();
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

