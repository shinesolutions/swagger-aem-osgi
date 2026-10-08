//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties.g.dart';

/// ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
///
/// Properties:
/// * [fieldWhitelist] 
/// * [sitePathFilters] 
/// * [sitePackageGroup] 
@BuiltValue()
abstract class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties implements Built<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties, ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  @BuiltValueField(wireName: r'sitePathFilters')
  ConfigNodePropertyArray? get sitePathFilters;

  @BuiltValueField(wireName: r'sitePackageGroup')
  ConfigNodePropertyString? get sitePackageGroup;

  ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties._();

  factory ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties([void updates(ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder b)]) = _$ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties> get serializer => _$ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesSerializer();
}

class _$ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties, _$ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties];

  @override
  final String wireName = r'ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.sitePathFilters != null) {
      yield r'sitePathFilters';
      yield serializers.serialize(
        object.sitePathFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.sitePackageGroup != null) {
      yield r'sitePackageGroup';
      yield serializers.serialize(
        object.sitePackageGroup,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder result,
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
        case r'sitePathFilters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.sitePathFilters.replace(valueDes);
          break;
        case r'sitePackageGroup':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sitePackageGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesBuilder();
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

