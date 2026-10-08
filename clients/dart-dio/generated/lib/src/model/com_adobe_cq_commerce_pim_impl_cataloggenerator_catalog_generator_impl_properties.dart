//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_properties.g.dart';

/// ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
///
/// Properties:
/// * [cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize] 
/// * [cqPeriodCommercePeriodCataloggeneratorPeriodBucketname] 
/// * [cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties] 
@BuiltValue()
abstract class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties implements Built<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.commerce.cataloggenerator.bucketsize')
  ConfigNodePropertyInteger? get cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize;

  @BuiltValueField(wireName: r'cq.commerce.cataloggenerator.bucketname')
  ConfigNodePropertyString? get cqPeriodCommercePeriodCataloggeneratorPeriodBucketname;

  @BuiltValueField(wireName: r'cq.commerce.cataloggenerator.excludedtemplateproperties')
  ConfigNodePropertyArray? get cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties;

  ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties._();

  factory ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties([void updates(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder b)]) = _$ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties> get serializer => _$ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesSerializer();
}

class _$ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties, _$ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties];

  @override
  final String wireName = r'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize != null) {
      yield r'cq.commerce.cataloggenerator.bucketsize';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname != null) {
      yield r'cq.commerce.cataloggenerator.bucketname';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties != null) {
      yield r'cq.commerce.cataloggenerator.excludedtemplateproperties';
      yield serializers.serialize(
        object.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.commerce.cataloggenerator.bucketsize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize.replace(valueDes);
          break;
        case r'cq.commerce.cataloggenerator.bucketname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname.replace(valueDes);
          break;
        case r'cq.commerce.cataloggenerator.excludedtemplateproperties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesBuilder();
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

