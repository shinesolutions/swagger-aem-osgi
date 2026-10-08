//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_polling_importer_impl_managed_polling_importer_impl_properties.g.dart';

/// ComDayCqPollingImporterImplManagedPollingImporterImplProperties
///
/// Properties:
/// * [importerPeriodUser] 
@BuiltValue()
abstract class ComDayCqPollingImporterImplManagedPollingImporterImplProperties implements Built<ComDayCqPollingImporterImplManagedPollingImporterImplProperties, ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'importer.user')
  ConfigNodePropertyString? get importerPeriodUser;

  ComDayCqPollingImporterImplManagedPollingImporterImplProperties._();

  factory ComDayCqPollingImporterImplManagedPollingImporterImplProperties([void updates(ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder b)]) = _$ComDayCqPollingImporterImplManagedPollingImporterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqPollingImporterImplManagedPollingImporterImplProperties> get serializer => _$ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesSerializer();
}

class _$ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqPollingImporterImplManagedPollingImporterImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqPollingImporterImplManagedPollingImporterImplProperties, _$ComDayCqPollingImporterImplManagedPollingImporterImplProperties];

  @override
  final String wireName = r'ComDayCqPollingImporterImplManagedPollingImporterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.importerPeriodUser != null) {
      yield r'importer.user';
      yield serializers.serialize(
        object.importerPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'importer.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.importerPeriodUser.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqPollingImporterImplManagedPollingImporterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqPollingImporterImplManagedPollingImporterImplPropertiesBuilder();
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

