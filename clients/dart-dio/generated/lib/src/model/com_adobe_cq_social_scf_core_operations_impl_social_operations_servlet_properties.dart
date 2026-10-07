//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties.g.dart';

/// ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodSelectors] 
/// * [slingPeriodServletPeriodExtensions] 
@BuiltValue()
abstract class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties implements Built<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyString? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'sling.servlet.extensions')
  ConfigNodePropertyString? get slingPeriodServletPeriodExtensions;

  ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties._();

  factory ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties([void updates(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder b)]) = _$ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties> get serializer => _$ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesSerializer();
}

class _$ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties, _$ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties];

  @override
  final String wireName = r'ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodServletPeriodExtensions != null) {
      yield r'sling.servlet.extensions';
      yield serializers.serialize(
        object.slingPeriodServletPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'sling.servlet.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodExtensions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder();
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

