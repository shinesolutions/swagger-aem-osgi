//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_cfm_impl_component_component_config_impl_properties.g.dart';

/// ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
///
/// Properties:
/// * [damPeriodCfmPeriodComponentPeriodResourceType] 
/// * [damPeriodCfmPeriodComponentPeriodFileReferenceProp] 
/// * [damPeriodCfmPeriodComponentPeriodElementsProp] 
/// * [damPeriodCfmPeriodComponentPeriodVariationProp] 
@BuiltValue()
abstract class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties implements Built<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties, ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'dam.cfm.component.resourceType')
  ConfigNodePropertyString? get damPeriodCfmPeriodComponentPeriodResourceType;

  @BuiltValueField(wireName: r'dam.cfm.component.fileReferenceProp')
  ConfigNodePropertyString? get damPeriodCfmPeriodComponentPeriodFileReferenceProp;

  @BuiltValueField(wireName: r'dam.cfm.component.elementsProp')
  ConfigNodePropertyString? get damPeriodCfmPeriodComponentPeriodElementsProp;

  @BuiltValueField(wireName: r'dam.cfm.component.variationProp')
  ConfigNodePropertyString? get damPeriodCfmPeriodComponentPeriodVariationProp;

  ComAdobeCqDamCfmImplComponentComponentConfigImplProperties._();

  factory ComAdobeCqDamCfmImplComponentComponentConfigImplProperties([void updates(ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder b)]) = _$ComAdobeCqDamCfmImplComponentComponentConfigImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties> get serializer => _$ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesSerializer();
}

class _$ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamCfmImplComponentComponentConfigImplProperties, _$ComAdobeCqDamCfmImplComponentComponentConfigImplProperties];

  @override
  final String wireName = r'ComAdobeCqDamCfmImplComponentComponentConfigImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.damPeriodCfmPeriodComponentPeriodResourceType != null) {
      yield r'dam.cfm.component.resourceType';
      yield serializers.serialize(
        object.damPeriodCfmPeriodComponentPeriodResourceType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.damPeriodCfmPeriodComponentPeriodFileReferenceProp != null) {
      yield r'dam.cfm.component.fileReferenceProp';
      yield serializers.serialize(
        object.damPeriodCfmPeriodComponentPeriodFileReferenceProp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.damPeriodCfmPeriodComponentPeriodElementsProp != null) {
      yield r'dam.cfm.component.elementsProp';
      yield serializers.serialize(
        object.damPeriodCfmPeriodComponentPeriodElementsProp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.damPeriodCfmPeriodComponentPeriodVariationProp != null) {
      yield r'dam.cfm.component.variationProp';
      yield serializers.serialize(
        object.damPeriodCfmPeriodComponentPeriodVariationProp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dam.cfm.component.resourceType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.damPeriodCfmPeriodComponentPeriodResourceType.replace(valueDes);
          break;
        case r'dam.cfm.component.fileReferenceProp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.damPeriodCfmPeriodComponentPeriodFileReferenceProp.replace(valueDes);
          break;
        case r'dam.cfm.component.elementsProp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.damPeriodCfmPeriodComponentPeriodElementsProp.replace(valueDes);
          break;
        case r'dam.cfm.component.variationProp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.damPeriodCfmPeriodComponentPeriodVariationProp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamCfmImplComponentComponentConfigImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder();
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

