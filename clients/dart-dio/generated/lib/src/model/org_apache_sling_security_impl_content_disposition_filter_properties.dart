//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_security_impl_content_disposition_filter_properties.g.dart';

/// OrgApacheSlingSecurityImplContentDispositionFilterProperties
///
/// Properties:
/// * [slingPeriodContentPeriodDispositionPeriodPaths] 
/// * [slingPeriodContentPeriodDispositionPeriodExcludedPeriodPaths] 
/// * [slingPeriodContentPeriodDispositionPeriodAllPeriodPaths] 
@BuiltValue()
abstract class OrgApacheSlingSecurityImplContentDispositionFilterProperties implements Built<OrgApacheSlingSecurityImplContentDispositionFilterProperties, OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.content.disposition.paths')
  ConfigNodePropertyArray? get slingPeriodContentPeriodDispositionPeriodPaths;

  @BuiltValueField(wireName: r'sling.content.disposition.excluded.paths')
  ConfigNodePropertyArray? get slingPeriodContentPeriodDispositionPeriodExcludedPeriodPaths;

  @BuiltValueField(wireName: r'sling.content.disposition.all.paths')
  ConfigNodePropertyBoolean? get slingPeriodContentPeriodDispositionPeriodAllPeriodPaths;

  OrgApacheSlingSecurityImplContentDispositionFilterProperties._();

  factory OrgApacheSlingSecurityImplContentDispositionFilterProperties([void updates(OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder b)]) = _$OrgApacheSlingSecurityImplContentDispositionFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingSecurityImplContentDispositionFilterProperties> get serializer => _$OrgApacheSlingSecurityImplContentDispositionFilterPropertiesSerializer();
}

class _$OrgApacheSlingSecurityImplContentDispositionFilterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingSecurityImplContentDispositionFilterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingSecurityImplContentDispositionFilterProperties, _$OrgApacheSlingSecurityImplContentDispositionFilterProperties];

  @override
  final String wireName = r'OrgApacheSlingSecurityImplContentDispositionFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingSecurityImplContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodContentPeriodDispositionPeriodPaths != null) {
      yield r'sling.content.disposition.paths';
      yield serializers.serialize(
        object.slingPeriodContentPeriodDispositionPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodContentPeriodDispositionPeriodExcludedPeriodPaths != null) {
      yield r'sling.content.disposition.excluded.paths';
      yield serializers.serialize(
        object.slingPeriodContentPeriodDispositionPeriodExcludedPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slingPeriodContentPeriodDispositionPeriodAllPeriodPaths != null) {
      yield r'sling.content.disposition.all.paths';
      yield serializers.serialize(
        object.slingPeriodContentPeriodDispositionPeriodAllPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingSecurityImplContentDispositionFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.content.disposition.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodContentPeriodDispositionPeriodPaths.replace(valueDes);
          break;
        case r'sling.content.disposition.excluded.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodContentPeriodDispositionPeriodExcludedPeriodPaths.replace(valueDes);
          break;
        case r'sling.content.disposition.all.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.slingPeriodContentPeriodDispositionPeriodAllPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingSecurityImplContentDispositionFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder();
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

