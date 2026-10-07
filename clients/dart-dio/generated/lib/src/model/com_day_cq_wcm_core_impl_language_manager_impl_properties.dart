//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_language_manager_impl_properties.g.dart';

/// ComDayCqWcmCoreImplLanguageManagerImplProperties
///
/// Properties:
/// * [langmgrPeriodListPeriodPath] 
/// * [langmgrPeriodCountryPeriodDefault] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplLanguageManagerImplProperties implements Built<ComDayCqWcmCoreImplLanguageManagerImplProperties, ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'langmgr.list.path')
  ConfigNodePropertyString? get langmgrPeriodListPeriodPath;

  @BuiltValueField(wireName: r'langmgr.country.default')
  ConfigNodePropertyArray? get langmgrPeriodCountryPeriodDefault;

  ComDayCqWcmCoreImplLanguageManagerImplProperties._();

  factory ComDayCqWcmCoreImplLanguageManagerImplProperties([void updates(ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplLanguageManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplLanguageManagerImplProperties> get serializer => _$ComDayCqWcmCoreImplLanguageManagerImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplLanguageManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplLanguageManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplLanguageManagerImplProperties, _$ComDayCqWcmCoreImplLanguageManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplLanguageManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplLanguageManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.langmgrPeriodListPeriodPath != null) {
      yield r'langmgr.list.path';
      yield serializers.serialize(
        object.langmgrPeriodListPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.langmgrPeriodCountryPeriodDefault != null) {
      yield r'langmgr.country.default';
      yield serializers.serialize(
        object.langmgrPeriodCountryPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplLanguageManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'langmgr.list.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.langmgrPeriodListPeriodPath.replace(valueDes);
          break;
        case r'langmgr.country.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.langmgrPeriodCountryPeriodDefault.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplLanguageManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplLanguageManagerImplPropertiesBuilder();
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

