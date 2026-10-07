//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_srp_impl_social_solr_connector_properties.g.dart';

/// ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
///
/// Properties:
/// * [srpPeriodType] 
@BuiltValue()
abstract class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties implements Built<ComAdobeCqSocialSrpImplSocialSolrConnectorProperties, ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder> {
  @BuiltValueField(wireName: r'srp.type')
  ConfigNodePropertyString? get srpPeriodType;

  ComAdobeCqSocialSrpImplSocialSolrConnectorProperties._();

  factory ComAdobeCqSocialSrpImplSocialSolrConnectorProperties([void updates(ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder b)]) = _$ComAdobeCqSocialSrpImplSocialSolrConnectorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSrpImplSocialSolrConnectorProperties> get serializer => _$ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesSerializer();
}

class _$ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSrpImplSocialSolrConnectorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSrpImplSocialSolrConnectorProperties, _$ComAdobeCqSocialSrpImplSocialSolrConnectorProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSrpImplSocialSolrConnectorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.srpPeriodType != null) {
      yield r'srp.type';
      yield serializers.serialize(
        object.srpPeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'srp.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.srpPeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSrpImplSocialSolrConnectorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSrpImplSocialSolrConnectorPropertiesBuilder();
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

